package o0oOOO0o;

import android.content.Context;
import com.orion.niui.components.dropdown.SingleSelectDropdownView;
import com.orion.notein.data.p602db.entity.PageLayerEntity;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00o00.C25206OooO0Oo;
import o0Ooo0Oo.C29410OooO0oO;
import o0Ooo0oO.C29423OooO00o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0oOOO0o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30827OooO0o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f110174OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f110175OooOo0o;

    public /* synthetic */ C30827OooO0o(Object obj, int i) {
        this.f110175OooOo0o = i;
        this.f110174OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        Object obj2;
        Object next;
        C32443OooOOO c32443OooOOO;
        Object next2;
        switch (this.f110175OooOo0o) {
            case 0:
                o0O0oo0.OooOOOO option = (o0O0oo0.OooOOOO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(option, "option");
                PagePaddingFragment pagePaddingFragment = (PagePaddingFragment) this.f110174OooOo;
                List list = (List) pagePaddingFragment.OooOooO().f104378OooOo00.f121747OooOo0o.getValue();
                Iterator it = list.iterator();
                while (true) {
                    obj2 = null;
                    if (it.hasNext()) {
                        next = it.next();
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(String.valueOf(((C29410OooO0oO) next).f104291OooO00o), option.f89518OooO00o)) {
                        }
                    } else {
                        next = null;
                    }
                }
                C29410OooO0oO c29410OooO0oO = (C29410OooO0oO) next;
                if (c29410OooO0oO == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                if (c29410OooO0oO.f104297OooO0oO) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (((C29410OooO0oO) next2).f104295OooO0o) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    C29410OooO0oO c29410OooO0oO2 = (C29410OooO0oO) next2;
                    String strValueOf = c29410OooO0oO2 != null ? String.valueOf(c29410OooO0oO2.f104291OooO00o) : null;
                    SingleSelectDropdownView singleSelectDropdownView = pagePaddingFragment.f74923Oooo00o;
                    if (singleSelectDropdownView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("clPaperSpec");
                        throw null;
                    }
                    singleSelectDropdownView.setSelectedOptionId(strValueOf);
                    Context contextRequireContext = pagePaddingFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    String string = pagePaddingFragment.getString(R.string.error_can_not_smaller_than_origins);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(contextRequireContext, string);
                    SingleSelectDropdownView singleSelectDropdownView2 = pagePaddingFragment.f74923Oooo00o;
                    if (singleSelectDropdownView2 != null) {
                        singleSelectDropdownView2.OooO();
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clPaperSpec");
                    throw null;
                }
                C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
                Page page = (Page) c29423OooO00oOooOooO.f104367OooOO0O.f121747OooOo0o.getValue();
                if (page != null) {
                    int i = C29423OooO00o.OooO0OO.f104390OooO00o[page.getRotationDirection().ordinal()];
                    float f = c29410OooO0oO.f104292OooO0O0;
                    float f2 = c29410OooO0oO.f104293OooO0OO;
                    if (i == 1) {
                        c32443OooOOO = new C32443OooOOO(Float.valueOf(f), Float.valueOf(f2));
                    } else if (i == 2) {
                        c32443OooOOO = new C32443OooOOO(Float.valueOf(f2), Float.valueOf(f));
                    } else if (i != 3) {
                        if (i != 4) {
                            throw new C32442OooOO0o();
                        }
                        c32443OooOOO = new C32443OooOOO(Float.valueOf(f2), Float.valueOf(f));
                    } else {
                        c32443OooOOO = new C32443OooOOO(Float.valueOf(f), Float.valueOf(f2));
                    }
                    float fFloatValue = ((Number) c32443OooOOO.f116638OooOo0o).floatValue();
                    float fFloatValue2 = ((Number) c32443OooOOO.f116637OooOo).floatValue();
                    int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(c29423OooO00oOooOooO.OooOOoo(fFloatValue));
                    int iOooO0O02 = oO0O00O.OooO00o.OooO0O0(c29423OooO00oOooOooO.OooOOoo(fFloatValue2));
                    Iterator<T> it3 = c29423OooO00oOooOooO.f104365OooO0oo.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next3 = it3.next();
                            C29410OooO0oO c29410OooO0oO3 = (C29410OooO0oO) next3;
                            if (oO0O00O.OooO00o.OooO0O0((c29410OooO0oO3.f104292OooO0O0 / 150.0f) * 72.0f) == iOooO0O0 && oO0O00O.OooO00o.OooO0O0((c29410OooO0oO3.f104293OooO0OO / 150.0f) * 72.0f) == iOooO0O02) {
                                obj2 = next3;
                            }
                        }
                    }
                    C29410OooO0oO c29410OooO0oO4 = (C29410OooO0oO) obj2;
                    if (c29410OooO0oO4 != null) {
                        c29423OooO00oOooOooO.OooOOOo(c29410OooO0oO4.f104292OooO0O0, c29410OooO0oO4.f104293OooO0OO);
                    } else {
                        c29423OooO00oOooOooO.OooOOOo(fFloatValue, fFloatValue2);
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM PageLayerEntity where note_id = ?");
                String str = (String) this.f110174OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "visible");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extras");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "name");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(new PageLayerEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3)) != 0, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5)));
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
