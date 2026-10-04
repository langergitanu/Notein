package OooOOOo;

import androidx.biometric.BiometricFragment;
import androidx.biometric.C21590OooO0o0;
import androidx.biometric.C21592OooO0oO;
import androidx.lifecycle.C21996Oooo0OO;
import androidx.lifecycle.InterfaceC21998Oooo0o0;
import com.aspose.slides.C22212OooOoO0;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import o000OOO.C24498OooO0o0;
import o000OOO.C24503OooOOo;
import o0O0o0oO.InterfaceC26013OooO00o;
import o0OoO0oo.o00OOOO0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: OooOOOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20451OooO0Oo implements InterfaceC21998Oooo0o0, ObjectConstructor, o000OOO.OooO, InterfaceC26013OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f58418OooOo0o;

    public /* synthetic */ C20451OooO0Oo(Object obj) {
        this.f58418OooOo0o = obj;
    }

    @Override // o000OOO.OooO
    public double OooO00o(double d) {
        float[] fArr = C24498OooO0o0.f82829OooO00o;
        return C24498OooO0o0.OooO0Oo((C24503OooOOo) this.f58418OooOo0o, d);
    }

    @Override // androidx.lifecycle.InterfaceC21998Oooo0o0
    public void OooO0O0(Object obj) {
        C21590OooO0o0.OooO0O0 oooO0O0 = (C21590OooO0o0.OooO0O0) obj;
        BiometricFragment biometricFragment = (BiometricFragment) this.f58418OooOo0o;
        if (oooO0O0 != null) {
            biometricFragment.Oooo000(oooO0O0);
            C21592OooO0oO c21592OooO0oO = biometricFragment.f63207OooOo0o;
            if (c21592OooO0oO.f63262OooOOoo == null) {
                c21592OooO0oO.f63262OooOOoo = new C21996Oooo0OO<>();
            }
            C21592OooO0oO.OooOO0(c21592OooO0oO.f63262OooOOoo, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Boolean OooO0OO(String str) {
        if (str.equals("label_add_annotation") || str.equals("label_add_stroke_line") || str.equals("label_add_text_annotation")) {
            NoteEditorFragment noteEditorFragment = (NoteEditorFragment) this.f58418OooOo0o;
            Integer num = (Integer) noteEditorFragment.OoooOO0().f73612o0OoOo0.f121747OooOo0o.getValue();
            if (num == null || num.intValue() != 0) {
                C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new o00OOOO0(noteEditorFragment, null), 3);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return ConstructorConstructor.lambda$get$3((String) this.f58418OooOo0o);
    }
}
