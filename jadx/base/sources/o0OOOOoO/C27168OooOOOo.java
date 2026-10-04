package o0OOOOoO;

import android.util.DisplayMetrics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o0000oOO.C24332OooO;
import o0OOo0Oo.InterfaceC27324Oooo0oo;
import o0OoOOO0.C29049OooOO0;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOO0.C29060OooOOo;
import o0OoOOO0.C29067OooOo0o;
import o0oOoOo.C31082Ooooo0o;
import o0oo0OOo.C31236OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33716OooO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOOOoO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27168OooOOOo implements InterfaceC27324Oooo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO f94848OooO00o;

    public C27168OooOOOo(OooOOO oooOOO) {
        this.f94848OooO00o = oooOOO;
    }

    @Override // o0OOo0Oo.InterfaceC27324Oooo0oo
    public final C27163OooO0Oo OooO() {
        return new C27163OooO0Oo(this.f94848OooO00o.f94841OooO00o.getData());
    }

    @Override // o0OOo0Oo.InterfaceC27324Oooo0oo
    public final Object OooO00o(C29060OooOOo c29060OooOOo) {
        Object objOooO00o = C24332OooO.OooO00o(this.f94848OooO00o.f94841OooO00o, new OooO(2, null), c29060OooOOo);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27324Oooo0oo
    public final Object OooO0O0(C29049OooOO0 c29049OooOO0) {
        Object objOooO00o = this.f94848OooO00o.OooO00o(c29049OooOO0);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27324Oooo0oo
    public final OooO0OO OooO0OO() {
        return new OooO0OO(this.f94848OooO00o.f94841OooO00o.getData());
    }

    @Override // o0OOo0Oo.InterfaceC27324Oooo0oo
    public final Object OooO0Oo(Map map, C29067OooOo0o c29067OooOo0o) {
        Object objOooO00o = C24332OooO.OooO00o(this.f94848OooO00o.f94841OooO00o, new OooOOO0(map, null), c29067OooOo0o);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27324Oooo0oo
    public final Object OooO0o(float f, C29051OooOO0o.OooOO0 oooOO02) {
        Object objOooO00o = C24332OooO.OooO00o(this.f94848OooO00o.f94841OooO00o, new OooOO0O(f, null), oooOO02);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27324Oooo0oo
    public final C27164OooO0o0 OooO0o0() {
        return new C27164OooO0o0(this.f94848OooO00o.f94841OooO00o.getData());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OOo0Oo.InterfaceC27324Oooo0oo
    public final C33716OooO OooO0oO() {
        List<C32443OooOOO<Integer, Integer>> list = C31236OooO00o.f111406OooO0OO;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C32443OooOOO c32443OooOOO = (C32443OooOOO) it.next();
            arrayList.add(new C31082Ooooo0o(((Number) c32443OooOOO.f116638OooOo0o).intValue(), ((Number) c32443OooOOO.f116637OooOo).intValue()));
        }
        return new C33716OooO(arrayList);
    }

    @Override // o0OOo0Oo.InterfaceC27324Oooo0oo
    public final Object OooO0oo(List list, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOOOO(this, list, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27324Oooo0oo
    public final Object OooOO0(int i, C29051OooOO0o.OooO oooO) {
        Object objOooO00o = C24332OooO.OooO00o(this.f94848OooO00o.f94841OooO00o, new OooOO0(i, null), oooO);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27324Oooo0oo
    public final C27165OooO0oO getTextStyle() {
        OooOOO oooOOO = this.f94848OooO00o;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(oooOOO.f94842OooO0O0.getResources().getDisplayMetrics());
        return new C27165OooO0oO(oooOOO.f94841OooO00o.getData(), displayMetrics);
    }
}
