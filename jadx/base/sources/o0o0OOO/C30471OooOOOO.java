package o0o0OOO;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.FragmentManager;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import com.orion.notein.data.p602db.entity.UserEntity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addpage.popup.AddThemeBottomSheetDialog;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0Oo00oO.C28038OooO0Oo;
import o0OoOO.C28985OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0o0OOO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30471OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f108812OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f108813OooOo0o;

    public /* synthetic */ C30471OooOOOO(Object obj, int i) {
        this.f108813OooOo0o = i;
        this.f108812OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        int i;
        int iOooO0o;
        switch (this.f108813OooOo0o) {
            case 0:
                MyTemplateFragment myTemplateFragment = (MyTemplateFragment) this.f108812OooOo;
                View view = (View) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
                C28985OooO00o c28985OooO00o = myTemplateFragment.f78619OooOooo;
                if (c28985OooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("addThemeMenu");
                    throw null;
                }
                synchronized (c28985OooO00o) {
                    try {
                        Context context = view.getContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                        if (C28038OooO0Oo.OooO0O0(context)) {
                            FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(view).getChildFragmentManager();
                            kotlin.jvm.internal.OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
                            AddThemeBottomSheetDialog addThemeBottomSheetDialog = new AddThemeBottomSheetDialog();
                            addThemeBottomSheetDialog.f73972OooOoO0 = c28985OooO00o.f102715OooO0O0;
                            c28985OooO00o.f102716OooO0OO = addThemeBottomSheetDialog;
                            addThemeBottomSheetDialog.show(childFragmentManager, "AddThemeBottomSheetDialog");
                        } else {
                            c28985OooO00o.f102716OooO0OO = null;
                            if (!c28985OooO00o.f102718OooO0o0) {
                                c28985OooO00o.OooO00o();
                            }
                            Rect rect = new Rect();
                            view.getGlobalVisibleRect(rect);
                            Object parent = view.getParent();
                            View view2 = parent instanceof View ? (View) parent : null;
                            View viewFindViewById = view2 != null ? view2.findViewById(R.id.btn_add_page) : null;
                            if (viewFindViewById != null) {
                                Rect rect2 = new Rect();
                                viewFindViewById.getGlobalVisibleRect(rect2);
                                i = rect2.right;
                                iOooO0o = Oooo0.o000000O.OooO0o(10);
                            } else {
                                i = rect.right;
                                iOooO0o = Oooo0.o000000O.OooO0o(10);
                            }
                            int i2 = i + iOooO0o;
                            PopupWindow popupWindow = c28985OooO00o.f102717OooO0Oo;
                            if (popupWindow == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                                throw null;
                            }
                            popupWindow.showAtLocation(view, 0, i2, (rect.bottom + rect.top) / 2);
                        }
                    } finally {
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from UserEntity where id = ?");
                String str = (String) this.f108812OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, IDToken.NICKNAME);
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "region");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "mobile");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "gender");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "hw_open_id");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "wx_open_id");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "xiaomi_union_id");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "honor_open_id");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "password");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "avatar");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "membership");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "offer_free_trial");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "on_free_trial");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "free_trial_start_time");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "free_trial_end_time");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "membership_start_time");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "membership_end_time");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        userEntity = new UserEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo11), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo12), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo14)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo15) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo15)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo16) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo16), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo17) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo17), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo18) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo18), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo19) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo19));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return userEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
