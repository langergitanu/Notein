package o00000;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.ref.WeakReference;
import o0ooOO0.C31534Oooo0o0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements InterfaceC24057OooOoO<C19597OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f81029OooO00o = new OooO00o();

    /* JADX INFO: renamed from: o00000.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19597OooO00o implements InterfaceC24058OooOoO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C24070Oooo0o0 f81030OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C24069Oooo0o f81031OooO0O0;

        public C19597OooO00o(C24070Oooo0o0 service, C24069Oooo0o c24069Oooo0o) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(service, "service");
            this.f81030OooO00o = service;
            this.f81031OooO0O0 = c24069Oooo0o;
        }

        @Override // o00000.InterfaceC24058OooOoO0
        public final InterfaceC24068Oooo0OO OooO00o() {
            Object obj = this.f81030OooO00o;
            InterfaceC24068Oooo0OO interfaceC24068Oooo0OO = obj instanceof InterfaceC24068Oooo0OO ? (InterfaceC24068Oooo0OO) obj : null;
            if (interfaceC24068Oooo0OO != null) {
                return interfaceC24068Oooo0OO;
            }
            throw new IllegalStateException("Text input service wrapper not set up! Did you use ComposeTestRule?");
        }

        @Override // o00000.InterfaceC24058OooOoO0
        public final InputConnectionC24063OooOooo OooO0O0(EditorInfo editorInfo) {
            C24069Oooo0o c24069Oooo0o = this.f81031OooO0O0;
            OooOOO imeOptions = c24069Oooo0o.f81102OooO0oo;
            Oooo0 textFieldValue = c24069Oooo0o.f81101OooO0oO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(imeOptions, "imeOptions");
            kotlin.jvm.internal.OooOOO0.OooO0oO(textFieldValue, "textFieldValue");
            boolean z = imeOptions.f81049OooO00o;
            int i = z ? 6 : 0;
            editorInfo.imeOptions = i;
            int i2 = imeOptions.f81051OooO0OO;
            if (i2 == 1) {
                editorInfo.inputType = 1;
            } else if (i2 == 2) {
                editorInfo.inputType = 1;
                editorInfo.imeOptions = Integer.MIN_VALUE | i;
            } else if (i2 == 3) {
                editorInfo.inputType = 2;
            } else if (i2 == 4) {
                editorInfo.inputType = 3;
            } else if (i2 == 5) {
                editorInfo.inputType = 17;
            } else if (i2 == 6) {
                editorInfo.inputType = 33;
            } else if (i2 == 7) {
                editorInfo.inputType = 129;
            } else if (i2 == 8) {
                editorInfo.inputType = 18;
            } else {
                if (i2 != 9) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                editorInfo.inputType = InputDeviceCompat.SOURCE_MOUSE;
            }
            if (!z) {
                int i3 = editorInfo.inputType;
                if ((i3 & 1) == 1) {
                    editorInfo.inputType = i3 | 131072;
                    editorInfo.imeOptions |= 1073741824;
                }
            }
            int i4 = editorInfo.inputType;
            if ((i4 & 1) == 1) {
                int i5 = imeOptions.f81050OooO0O0;
                if (i5 == 1) {
                    editorInfo.inputType = i4 | 4096;
                } else if (i5 == 2) {
                    editorInfo.inputType = i4 | 8192;
                } else if (i5 == 3) {
                    editorInfo.inputType = i4 | 16384;
                }
                editorInfo.inputType |= 32768;
            }
            int i6 = C34696OooOOoo.f124979OooO0OO;
            long j = textFieldValue.f81084OooO0O0;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.f81083OooO00o.f124887OooOo0o);
            editorInfo.imeOptions |= 33554432;
            if (androidx.emoji2.text.OooO0OO.OooO0OO()) {
                androidx.emoji2.text.OooO0OO.OooO00o().OooO0oo(editorInfo);
            }
            Oooo0 oooo0 = c24069Oooo0o.f81101OooO0oO;
            c24069Oooo0o.f81102OooO0oo.getClass();
            InputConnectionC24063OooOooo inputConnectionC24063OooOooo = new InputConnectionC24063OooOooo(oooo0, new C24072Oooo0oo(c24069Oooo0o));
            c24069Oooo0o.f81094OooO.add(new WeakReference(inputConnectionC24063OooOooo));
            return inputConnectionC24063OooOooo;
        }
    }

    @Override // o00000.InterfaceC24057OooOoO
    public final C19597OooO00o OooO00o(View view, OooOo platformTextInput) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(platformTextInput, "platformTextInput");
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        C24069Oooo0o c24069Oooo0o = new C24069Oooo0o(view, platformTextInput);
        return new C19597OooO00o((C24070Oooo0o0) C31534Oooo0o0.f112729OooO00o.invoke(c24069Oooo0o), c24069Oooo0o);
    }
}
