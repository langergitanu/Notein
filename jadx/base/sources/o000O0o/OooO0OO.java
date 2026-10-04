package o000O0o;

import android.text.Editable;
import android.text.Selection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import o000O000.OooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends InputConnectionWrapper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EditText f82388OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f82389OooO0O0;

    public static class OooO00o {
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
        
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
        
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean OooO00o(OooO0OO oooO0OO, Editable editable, int i, int i2, boolean z) {
            int iMin;
            if (editable != null && i >= 0 && i2 >= 0) {
                int selectionStart = Selection.getSelectionStart(editable);
                int selectionEnd = Selection.getSelectionEnd(editable);
                if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                    if (z) {
                        int iMax = Math.max(i, 0);
                        int length = editable.length();
                        if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                            selectionStart = -1;
                            int iMax2 = Math.max(i2, 0);
                            iMin = editable.length();
                            if (selectionEnd >= 0 || iMin < selectionEnd || iMax2 < 0) {
                                iMin = -1;
                                if (selectionStart != -1 && iMin != -1) {
                                }
                            } else {
                                loop2: while (true) {
                                    boolean z2 = false;
                                    while (true) {
                                        if (iMax2 == 0) {
                                            iMin = selectionEnd;
                                            break loop2;
                                        }
                                        if (selectionEnd >= iMin) {
                                            if (z2) {
                                                break;
                                            }
                                        } else {
                                            char cCharAt = editable.charAt(selectionEnd);
                                            if (z2) {
                                                break;
                                            }
                                            if (!Character.isSurrogate(cCharAt)) {
                                                iMax2--;
                                                selectionEnd++;
                                            } else {
                                                if (Character.isLowSurrogate(cCharAt)) {
                                                    break loop2;
                                                }
                                                selectionEnd++;
                                                z2 = true;
                                            }
                                        }
                                    }
                                    iMax2--;
                                    selectionEnd++;
                                }
                                iMin = -1;
                                if (selectionStart != -1) {
                                }
                            }
                        } else {
                            loop0: while (true) {
                                boolean z3 = false;
                                while (true) {
                                    if (iMax == 0) {
                                        break loop0;
                                    }
                                    selectionStart--;
                                    if (selectionStart >= 0) {
                                        char cCharAt2 = editable.charAt(selectionStart);
                                        if (z3) {
                                            break;
                                        }
                                        if (!Character.isSurrogate(cCharAt2)) {
                                            iMax--;
                                        } else {
                                            if (Character.isHighSurrogate(cCharAt2)) {
                                                break loop0;
                                            }
                                            z3 = true;
                                        }
                                    } else {
                                        if (z3) {
                                            break loop0;
                                        }
                                        selectionStart = 0;
                                    }
                                }
                                iMax--;
                            }
                            selectionStart = -1;
                            int iMax22 = Math.max(i2, 0);
                            iMin = editable.length();
                            if (selectionEnd >= 0) {
                                iMin = -1;
                                if (selectionStart != -1) {
                                }
                            }
                        }
                    } else {
                        selectionStart = Math.max(selectionStart - i, 0);
                        iMin = Math.min(selectionEnd + i2, editable.length());
                    }
                    OooO[] oooOArr = (OooO[]) editable.getSpans(selectionStart, iMin, OooO.class);
                    if (oooOArr != null && oooOArr.length > 0) {
                        for (OooO oooO : oooOArr) {
                            int spanStart = editable.getSpanStart(oooO);
                            int spanEnd = editable.getSpanEnd(oooO);
                            selectionStart = Math.min(spanStart, selectionStart);
                            iMin = Math.max(spanEnd, iMin);
                        }
                        int iMax3 = Math.max(selectionStart, 0);
                        int iMin2 = Math.min(iMin, editable.length());
                        oooO0OO.beginBatchEdit();
                        editable.delete(iMax3, iMin2);
                        oooO0OO.endBatchEdit();
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public OooO0OO(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        OooO00o oooO00o = new OooO00o();
        super(inputConnection, false);
        this.f82388OooO00o = editText;
        this.f82389OooO0O0 = oooO00o;
        if (androidx.emoji2.text.OooO0OO.OooO0OO()) {
            androidx.emoji2.text.OooO0OO.OooO00o().OooO0oo(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f82388OooO00o.getEditableText();
        this.f82389OooO0O0.getClass();
        return OooO00o.OooO00o(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f82388OooO00o.getEditableText();
        this.f82389OooO0O0.getClass();
        return OooO00o.OooO00o(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
