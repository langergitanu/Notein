package o00000;

import Oooo000.C20901OooOOo0;
import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import com.aspose.words.StyleIdentifier;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: renamed from: o00000.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC24063OooOooo implements InputConnection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24072Oooo0oo f81075OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f81076OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Oooo0 f81077OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f81078OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f81079OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f81080OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f81081OooO0oO;

    public InputConnectionC24063OooOooo(Oooo0 initState, C24072Oooo0oo c24072Oooo0oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initState, "initState");
        this.f81075OooO00o = c24072Oooo0oo;
        this.f81077OooO0OO = initState;
        this.f81079OooO0o = new ArrayList();
        this.f81081OooO0oO = true;
    }

    public final void OooO00o(OooO0o oooO0o) {
        this.f81076OooO0O0++;
        try {
            this.f81079OooO0o.add(oooO0o);
        } finally {
            OooO0O0();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    public final boolean OooO0O0() {
        int i = this.f81076OooO0O0 - 1;
        this.f81076OooO0O0 = i;
        if (i == 0) {
            ArrayList arrayList = this.f81079OooO0o;
            if (!arrayList.isEmpty()) {
                this.f81075OooO00o.f81117OooO00o.f81100OooO0o0.invoke(oOo000Oo.OooOo.o0ooOoO(arrayList));
                arrayList.clear();
            }
        }
        return this.f81076OooO0O0 > 0;
    }

    public final void OooO0OO(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f81081OooO0oO;
        if (!z) {
            return z;
        }
        this.f81076OooO0O0++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f81081OooO0oO;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f81079OooO0o.clear();
        this.f81076OooO0O0 = 0;
        this.f81081OooO0oO = false;
        C24069Oooo0o c24069Oooo0o = this.f81075OooO00o.f81117OooO00o;
        int size = c24069Oooo0o.f81094OooO.size();
        for (int i = 0; i < size; i++) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((WeakReference) c24069Oooo0o.f81094OooO.get(i)).get(), this)) {
                c24069Oooo0o.f81094OooO.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f81081OooO0oO;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inputContentInfo, "inputContentInfo");
        boolean z = this.f81081OooO0oO;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f81081OooO0oO;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f81081OooO0oO;
        if (z) {
            OooO00o(new OooO0O0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f81081OooO0oO;
        if (!z) {
            return z;
        }
        OooO00o(new C24045OooO0Oo(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f81081OooO0oO;
        if (!z) {
            return z;
        }
        OooO00o(new C24046OooO0o0(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return OooO0O0();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f81081OooO0oO;
        if (!z) {
            return z;
        }
        OooO00o(new OooOO0O());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        Oooo0 oooo0 = this.f81077OooO0OO;
        return TextUtils.getCapsMode(oooo0.f81083OooO00o.f124887OooOo0o, C34696OooOOoo.OooO0Oo(oooo0.f81084OooO0O0), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f81080OooO0o0 = z;
        if (z) {
            this.f81078OooO0Oo = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return C20901OooOOo0.OooO0o0(this.f81077OooO0OO);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C34696OooOOoo.OooO0O0(this.f81077OooO0OO.f81084OooO0O0)) {
            return null;
        }
        return C24067Oooo0O0.OooO00o(this.f81077OooO0OO).f124887OooOo0o;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return C24067Oooo0O0.OooO0O0(this.f81077OooO0OO, i).f124887OooOo0o;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return C24067Oooo0O0.OooO0OO(this.f81077OooO0OO, i).f124887OooOo0o;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f81081OooO0oO;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    OooO00o(new C24066Oooo00o(0, this.f81077OooO0OO.f81083OooO00o.f124887OooOo0o.length()));
                    break;
                case R.id.cut:
                    OooO0OO(StyleIdentifier.GRID_TABLE_5_DARK);
                    return false;
                case R.id.copy:
                    OooO0OO(StyleIdentifier.GRID_TABLE_6_COLORFUL);
                    return false;
                case R.id.paste:
                    OooO0OO(StyleIdentifier.GRID_TABLE_7_COLORFUL);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.f81081OooO0oO;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
                this.f81075OooO00o.f81117OooO00o.f81099OooO0o.invoke(new OooOOO0(i2));
            } else {
                i2 = 1;
                this.f81075OooO00o.f81117OooO00o.f81099OooO0o.invoke(new OooOOO0(i2));
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f81081OooO0oO;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z = this.f81081OooO0oO;
        if (!z) {
            return z;
        }
        Log.w("RecordingIC", "requestCursorUpdates is not supported");
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
        boolean z = this.f81081OooO0oO;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) this.f81075OooO00o.f81117OooO00o.f81103OooOO0.getValue()).sendKeyEvent(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f81081OooO0oO;
        if (z) {
            OooO00o(new Oooo000(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f81081OooO0oO;
        if (z) {
            OooO00o(new C24065Oooo00O(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f81081OooO0oO;
        if (!z) {
            return z;
        }
        OooO00o(new C24066Oooo00o(i, i2));
        return true;
    }
}
