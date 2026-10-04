package o0o000oo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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

/* JADX INFO: renamed from: o0o000oo.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarViewModel$moveToolbarItem$1", m80623f = "ToolbarViewModel.kt", m80624l = {716}, m80625m = "invokeSuspend")
public final class C29859OoooooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f105899OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105900OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f105901OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f105902OooOoO0;

    /* JADX INFO: renamed from: o0o000oo.OoooooO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarViewModel$moveToolbarItem$1$1", m80623f = "ToolbarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ o00Ooo f105903OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f105904OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f105905OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00Ooo o00ooo2, ArrayList arrayList, Continuation continuation) {
            super(2, continuation);
            this.f105903OooOo = o00ooo2;
            this.f105905OooOoO0 = arrayList;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f105903OooOo, this.f105905OooOoO0, continuation);
            oooO00o.f105904OooOo0o = obj;
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
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f105904OooOo0o;
            o00Ooo o00ooo2 = this.f105903OooOo;
            oOo00O0O.OooOo00 oooOo00 = o00ooo2.f105927OooO0oO;
            oooOo00.getClass();
            c24334OooO0O0.OooO0oO(o00ooo2.f105925OooO0o, oooOo00.OooO00o(new C33938OooO0o0(C29909OooO0O0.Companion.serializer()), this.f105905OooOoO0));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29859OoooooO(o00Ooo o00ooo2, int i, int i2, Continuation<? super C29859OoooooO> continuation) {
        super(2, continuation);
        this.f105899OooOo = o00ooo2;
        this.f105902OooOoO0 = i;
        this.f105901OooOoO = i2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29859OoooooO(this.f105899OooOo, this.f105902OooOoO0, this.f105901OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29859OoooooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105900OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00Ooo o00ooo2 = this.f105899OooOo;
            ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO((Collection) o00ooo2.f105935OooOOOo.f121747OooOo0o.getValue());
            if (arrayListO0ooOoO.isEmpty()) {
                arrayListO0ooOoO.addAll(o00ooo2.f105929OooOO0);
            }
            int i2 = this.f105902OooOoO0;
            if (i2 < 0 || i2 >= arrayListO0ooOoO.size()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("ToolbarViewModel");
                c20358OooO00o.OooO0OO("moveAudioFile. newPos is out of range", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            Iterator it = arrayListO0ooOoO.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C29909OooO0O0) next).f106118OooO00o == this.f105901OooOoO) {
                    break;
                }
            }
            C29909OooO0O0 c29909OooO0O0 = (C29909OooO0O0) next;
            if (c29909OooO0O0 == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            arrayListO0ooOoO.remove(c29909OooO0O0);
            arrayListO0ooOoO.add(i2, c29909OooO0O0);
            OooO00o oooO00o = new OooO00o(o00ooo2, arrayListO0ooOoO, null);
            this.f105900OooOo0o = 1;
            if (C24332OooO.OooO00o(o00ooo2.f105926OooO0o0, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
