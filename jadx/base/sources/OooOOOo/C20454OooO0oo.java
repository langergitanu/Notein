package OooOOOo;

import androidx.biometric.BiometricFragment;
import androidx.biometric.C21590OooO0o0;
import androidx.biometric.C21592OooO0oO;
import androidx.lifecycle.InterfaceC21998Oooo0o0;
import com.google.firebase.inappmessaging.internal.CampaignCacheClient;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.shapeeditor.AbstractShapeEditor;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesAnchorEditor;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesEditorPanel;
import com.orion.penkit.models.OnAssistLinesChangedListener;
import java.util.Set;
import o000OOO.C24498OooO0o0;
import o000OOO.C24503OooOOo;
import oO00o00o.InterfaceC32330OooO0O0;

/* JADX INFO: renamed from: OooOOOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20454OooO0oo implements InterfaceC21998Oooo0o0, InterfaceC32330OooO0O0, ObjectConstructor, o000OOO.OooO, OnAssistLinesChangedListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f58422OooOo0o;

    public /* synthetic */ C20454OooO0oo(Object obj) {
        this.f58422OooOo0o = obj;
    }

    @Override // o000OOO.OooO
    public double OooO00o(double d) {
        float[] fArr = C24498OooO0o0.f82829OooO00o;
        return C24498OooO0o0.OooO0OO((C24503OooOOo) this.f58422OooOo0o, d);
    }

    @Override // androidx.lifecycle.InterfaceC21998Oooo0o0
    public void OooO0O0(Object obj) {
        BiometricFragment biometricFragment = (BiometricFragment) this.f58422OooOo0o;
        if (((Boolean) obj).booleanValue()) {
            if (biometricFragment.OooOoOO()) {
                biometricFragment.OooOoo();
            } else {
                C21592OooO0oO c21592OooO0oO = biometricFragment.f63207OooOo0o;
                String string = c21592OooO0oO.f63254OooOO0O;
                if (string == null) {
                    C21590OooO0o0.C21591OooO0Oo c21591OooO0Oo = c21592OooO0oO.f63249OooO0o;
                    if (c21591OooO0Oo != null) {
                        string = c21591OooO0Oo.f63240OooO0OO;
                        if (string == null) {
                            string = "";
                        }
                    } else {
                        string = null;
                    }
                }
                if (string == null) {
                    string = biometricFragment.getString(R.string.default_error_msg);
                }
                biometricFragment.OooOooO(13, string);
                biometricFragment.OooOoO0(2);
            }
            biometricFragment.f63207OooOo0o.OooO(false);
        }
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) throws Exception {
        ((CampaignCacheClient) this.f58422OooOo0o).lambda$get$3((Throwable) obj);
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return ConstructorConstructor.lambda$newUnsafeAllocator$19((String) this.f58422OooOo0o);
    }

    @Override // com.orion.penkit.models.OnAssistLinesChangedListener
    public void onAssistLinesChanged(Set it) {
        int i = ShapesEditorPanel.f76301OoooO0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        AbstractShapeEditor abstractShapeEditor = ((ShapesEditorPanel) this.f58422OooOo0o).f76307OooOoo;
        if (abstractShapeEditor == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        ShapesAnchorEditor shapesAnchorEditor = abstractShapeEditor instanceof ShapesAnchorEditor ? (ShapesAnchorEditor) abstractShapeEditor : null;
        if (shapesAnchorEditor != null) {
            shapesAnchorEditor.setCurrentAssistLines(it);
        }
    }
}
