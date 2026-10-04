package com.orion.notein.richeditor;

import android.text.Spannable;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes9.dex */
class RTOperationManager {
    private static final int MAX_NR_OF_OPERATIONS = 50;
    private static final int TIME_BETWEEN_OPERATIONS = 300;
    private Map<Integer, Stack<Operation>> mUndoStacks = new HashMap();
    private Map<Integer, Stack<Operation>> mRedoStacks = new HashMap();

    public static abstract class Operation {
        private Spannable mAfter;
        private Spannable mBefore;
        private int mSelEndAfter;
        private int mSelEndBefore;
        private int mSelStartAfter;
        private int mSelStartBefore;
        private long mTimestamp = System.currentTimeMillis();

        public Operation(Spannable spannable, Spannable spannable2, int i, int i2, int i3, int i4) {
            this.mSelStartBefore = i;
            this.mSelEndBefore = i2;
            this.mSelStartAfter = i3;
            this.mSelEndAfter = i4;
            this.mBefore = spannable;
            this.mAfter = spannable2;
        }

        public boolean canMerge(Operation operation) {
            return Math.abs(this.mTimestamp - operation.mTimestamp) < 300;
        }

        public Operation merge(Operation operation) {
            this.mBefore = operation.mBefore;
            this.mSelStartBefore = operation.mSelStartBefore;
            this.mSelEndBefore = operation.mSelEndBefore;
            return this;
        }

        public void redo(RTEditText rTEditText) {
            rTEditText.ignoreTextChanges();
            rTEditText.setText(this.mAfter);
            rTEditText.setSelection(this.mSelStartAfter, this.mSelEndAfter);
            rTEditText.registerTextChanges();
        }

        public void undo(RTEditText rTEditText) {
            rTEditText.ignoreTextChanges();
            rTEditText.setText(this.mBefore);
            rTEditText.setSelection(this.mSelStartBefore, this.mSelEndBefore);
            rTEditText.registerTextChanges();
        }
    }

    public static class TextChangeOperation extends Operation {
        public TextChangeOperation(Spannable spannable, Spannable spannable2, int i, int i2, int i3, int i4) {
            super(spannable, spannable2, i, i2, i3, i4);
        }
    }

    private Stack<Operation> getRedoStack(RTEditText rTEditText) {
        return getStack(this.mRedoStacks, rTEditText);
    }

    private Stack<Operation> getStack(Map<Integer, Stack<Operation>> map, RTEditText rTEditText) {
        Stack<Operation> stack = map.get(Integer.valueOf(rTEditText.getId()));
        if (stack != null) {
            return stack;
        }
        Stack<Operation> stack2 = new Stack<>();
        map.put(Integer.valueOf(rTEditText.getId()), stack2);
        return stack2;
    }

    private Stack<Operation> getUndoStack(RTEditText rTEditText) {
        return getStack(this.mUndoStacks, rTEditText);
    }

    private void push(Operation operation, Stack<Operation> stack) {
        if (stack.size() >= 50) {
            stack.remove(0);
        }
        stack.push(operation);
    }

    public synchronized void executed(RTEditText rTEditText, Operation operation) {
        try {
            Stack<Operation> undoStack = getUndoStack(rTEditText);
            Stack<Operation> redoStack = getRedoStack(rTEditText);
            while (!undoStack.empty() && operation.canMerge(undoStack.peek())) {
                operation.merge(undoStack.pop());
            }
            push(operation, undoStack);
            redoStack.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void flushOperations(RTEditText rTEditText) {
        Stack<Operation> undoStack = getUndoStack(rTEditText);
        Stack<Operation> redoStack = getRedoStack(rTEditText);
        undoStack.clear();
        redoStack.clear();
    }

    public synchronized void redo(RTEditText rTEditText) {
        Stack<Operation> redoStack = getRedoStack(rTEditText);
        if (!redoStack.empty()) {
            Stack<Operation> undoStack = getUndoStack(rTEditText);
            Operation operationPop = redoStack.pop();
            push(operationPop, undoStack);
            operationPop.redo(rTEditText);
            while (!redoStack.empty() && operationPop.canMerge(redoStack.peek())) {
                operationPop = redoStack.pop();
                push(operationPop, undoStack);
                operationPop.redo(rTEditText);
            }
        }
    }

    public synchronized void undo(RTEditText rTEditText) {
        Stack<Operation> undoStack = getUndoStack(rTEditText);
        if (!undoStack.empty()) {
            Stack<Operation> redoStack = getRedoStack(rTEditText);
            Operation operationPop = undoStack.pop();
            push(operationPop, redoStack);
            operationPop.undo(rTEditText);
            while (!undoStack.empty() && operationPop.canMerge(undoStack.peek())) {
                operationPop = undoStack.pop();
                push(operationPop, redoStack);
                operationPop.undo(rTEditText);
            }
        }
    }
}
