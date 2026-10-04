package o0o000oo;

import Oooo0.C20860Ooooooo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o0o00Oo0.C29909OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0oO00.C33938OooO0o0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarViewModel$setToolbarItemVisibility$1", m80623f = "ToolbarViewModel.kt", m80624l = {692}, m80625m = "invokeSuspend")
public final class o0OoOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f105943OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105944OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f105945OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f105946OooOoO0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarViewModel$setToolbarItemVisibility$1$1", m80623f = "ToolbarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ o00Ooo f105947OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f105948OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f105949OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00Ooo o00ooo2, ArrayList arrayList, Continuation continuation) {
            super(2, continuation);
            this.f105947OooOo = o00ooo2;
            this.f105949OooOoO0 = arrayList;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f105947OooOo, this.f105949OooOoO0, continuation);
            oooO00o.f105948OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f105948OooOo0o;
            o00Ooo o00ooo2 = this.f105947OooOo;
            oOo00O0O.OooOo00 oooOo00 = o00ooo2.f105927OooO0oO;
            oooOo00.getClass();
            c24334OooO0O0.OooO0oO(o00ooo2.f105925OooO0o, oooOo00.OooO00o(new C33938OooO0o0(C29909OooO0O0.Companion.serializer()), this.f105949OooOoO0));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(o00Ooo o00ooo2, boolean z, int i, Continuation<? super o0OoOo0> continuation) {
        super(2, continuation);
        this.f105943OooOo = o00ooo2;
        this.f105946OooOoO0 = z;
        this.f105945OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0OoOo0(this.f105943OooOo, this.f105946OooOoO0, this.f105945OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o0OoOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079 A[SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        int i;
        boolean zHasNext;
        int i2;
        OooO00o oooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f105944OooOo0o;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00Ooo o00ooo2 = this.f105943OooOo;
            ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO((Collection) o00ooo2.f105935OooOOOo.f121747OooOo0o.getValue());
            int size = arrayListO0ooOoO.size();
            List<C29909OooO0O0> list = o00ooo2.f105929OooOO0;
            if (size != list.size()) {
                ArrayList arrayListOooO0o0 = o00Ooo.OooO0o0(o00ooo2, arrayListO0ooOoO);
                arrayListO0ooOoO.clear();
                arrayListO0ooOoO.addAll(arrayListOooO0o0);
                it = arrayListO0ooOoO.iterator();
                i = 0;
                while (true) {
                    zHasNext = it.hasNext();
                    i2 = this.f105945OooOoO;
                    if (zHasNext) {
                        i = -1;
                        break;
                    }
                    if (((C29909OooO0O0) it.next()).f106118OooO00o == i2) {
                        break;
                    }
                    i++;
                }
                if (i == -1) {
                    C29909OooO0O0 c29909OooO0O0 = (C29909OooO0O0) arrayListO0ooOoO.get(i);
                    arrayListO0ooOoO.set(i, new C29909OooO0O0(c29909OooO0O0.f106118OooO00o, c29909OooO0O0.f106119OooO0O0, c29909OooO0O0.f106120OooO0OO, this.f105946OooOoO0, c29909OooO0O0.f106122OooO0o0));
                } else {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooO0OO(C20860Ooooooo.OooO0OO(c20358OooO00o, "ToolbarViewModel", "setToolbarItemVisibility. type not found: ", i2), new Object[0]);
                }
                oooO00o = new OooO00o(o00ooo2, arrayListO0ooOoO, null);
                this.f105944OooOo0o = 1;
                if (C24332OooO.OooO00o(o00ooo2.f105926OooO0o0, oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (!arrayListO0ooOoO.isEmpty()) {
                    Iterator it2 = arrayListO0ooOoO.iterator();
                    while (it2.hasNext()) {
                        if (!list.contains((C29909OooO0O0) it2.next())) {
                            ArrayList arrayListOooO0o02 = o00Ooo.OooO0o0(o00ooo2, arrayListO0ooOoO);
                            arrayListO0ooOoO.clear();
                            arrayListO0ooOoO.addAll(arrayListOooO0o02);
                            break;
                        }
                    }
                }
                it = arrayListO0ooOoO.iterator();
                i = 0;
                while (true) {
                    zHasNext = it.hasNext();
                    i2 = this.f105945OooOoO;
                    if (zHasNext) {
                    }
                    i++;
                }
                if (i == -1) {
                }
                oooO00o = new OooO00o(o00ooo2, arrayListO0ooOoO, null);
                this.f105944OooOo0o = 1;
                if (C24332OooO.OooO00o(o00ooo2.f105926OooO0o0, oooO00o, this) == enumC32485OooO00o) {
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
