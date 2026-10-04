package o000O0oo;

import android.content.Context;
import android.hardware.HardwareBuffer;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.graphics.surface.OooO00o;
import androidx.graphics.surface.OooO0o;
import androidx.graphics.surface.SurfaceControlCompat;
import androidx.ink.authoring.internal.OooO0o;
import com.orion.notein.data.p602db.entity.FolderEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.login.password.PasswordLoginFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import java.util.HashMap;
import o000O00.OooO00o;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0oOoOoO.C31099OooO0o0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: o000O0oo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24427OooOOOo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82435OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82436OooOo0o;

    public /* synthetic */ C24427OooOOOo(Object obj, int i) {
        this.f82436OooOo0o = i;
        this.f82435OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        int iOooO;
        switch (this.f82436OooOo0o) {
            case 0:
                OooO00o.OooO0OO renderResult = (OooO00o.OooO0OO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(renderResult, "renderResult");
                OooO0o.C19024OooO0o c19024OooO0o = (OooO0o.C19024OooO0o) this.f82435OooOo;
                c19024OooO0o.OooO00o();
                if (!c19024OooO0o.f65236OooO0OO.get()) {
                    c19024OooO0o.OooO00o();
                    OooO0o.OooO0OO oooO0OO = c19024OooO0o.f65237OooO0Oo.get();
                    if (oooO0OO != null) {
                        OooO0o.C19024OooO0o.C21937OooO0o0 c21937OooO0o0 = c19024OooO0o.f65238OooO0o;
                        OooO0o.OooO0O0 oooO0O0 = c21937OooO0o0.f65252OooO00o;
                        OooO0o.OooO0O0 oooO0O02 = oooO0OO.f65230OooO00o;
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0O0, oooO0O02)) {
                            SurfaceControlCompat surfaceControlCompat = oooO0O02.f65226OooO00o;
                            HashMap map = new HashMap();
                            int i = Build.VERSION.SDK_INT;
                            OooO0o.OooO00o oooO00o = androidx.graphics.surface.OooO0o.f65129OooO00o;
                            OooO00o.OooO0O0 oooO0O0OooO0Oo = i >= 33 ? oooO00o.OooO0Oo() : oooO00o.OooO0OO();
                            HardwareBuffer hardwareBuffer = renderResult.f82174OooO00o;
                            androidx.graphics.surface.OooO00o oooO00o2 = surfaceControlCompat.f65140OooO00o;
                            oooO0O0OooO0Oo.o000OO(oooO00o2, hardwareBuffer, null, null);
                            Integer num = c19024OooO0o.f65234OooO00o.f65225OooO0oO;
                            if (num != null) {
                                int iIntValue = num.intValue();
                                map.put(surfaceControlCompat, Integer.valueOf(iIntValue));
                                oooO0O0OooO0Oo.o00000(oooO00o2, iIntValue);
                            }
                            map.clear();
                            oooO0O0OooO0Oo.commit();
                        }
                        androidx.ink.authoring.internal.OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooO0o = androidx.ink.authoring.internal.OooO0o.this;
                        ((androidx.ink.authoring.internal.OooOO0) oooO0o.OooO0o0()).OooOOo(oooO0o.f65215OooOOO);
                        ((androidx.ink.authoring.internal.OooOO0) oooO0o.OooO0o0()).OooO0oo();
                        c21937OooO0o0.f65252OooO00o = null;
                        if (oooO0o.f65214OooOO0o.getAndUpdate(new OooOOO0()) > 0) {
                            c19024OooO0o.OooO0Oo();
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            case 1:
                View it = (View) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                Context contextRequireContext = ((PasswordLoginFragment) this.f82435OooOo).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
                return C32460OooOooO.f116667OooO00o;
            case 2:
                Fragment fragment = (Fragment) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(fragment, "fragment");
                NoteEditorContainerFragment noteEditorContainerFragment = (NoteEditorContainerFragment) this.f82435OooOo;
                Fragment fragmentOooOooo = noteEditorContainerFragment.getChildFragmentManager().OooOooo(fragment.getClass().getSimpleName());
                if (fragmentOooOooo == null) {
                    FragmentManager childFragmentManager = noteEditorContainerFragment.getChildFragmentManager();
                    androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
                    oooO00oOooO0OO.OooO0Oo(0, fragment, fragment.getClass().getSimpleName(), 1);
                    iOooO = oooO00oOooO0OO.OooO(false, true);
                } else {
                    FragmentManager childFragmentManager2 = noteEditorContainerFragment.getChildFragmentManager();
                    childFragmentManager2.getClass();
                    androidx.fragment.app.OooO00o oooO00o3 = new androidx.fragment.app.OooO00o(childFragmentManager2);
                    oooO00o3.OooOOO0(fragmentOooOooo);
                    oooO00o3.OooO0Oo(0, fragment, fragment.getClass().getSimpleName(), 1);
                    iOooO = oooO00o3.OooO(false, true);
                }
                return Integer.valueOf(iOooO);
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from FolderEntity where id = ?");
                String str = (String) this.f82435OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_parent_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_favorite");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "cover_color");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        folderEntity = new FolderEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12)));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return folderEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
