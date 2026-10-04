package o0Ooo0oo;

import com.orion.notein.domain.models.note.PenInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0oo.o0000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$sortFavoritePenList$1", m80623f = "PenBarViewModel.kt", m80624l = {1509}, m80625m = "invokeSuspend")
public final class C29525o0000o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104722OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104723OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f104724OooOoO0;

    /* JADX INFO: renamed from: o0Ooo0oo.o0000o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$sortFavoritePenList$1$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104725OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f104726OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ List<PenInfo> f104727OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, List<PenInfo> list, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f104725OooOo = oooO0O0;
            this.f104727OooOoO0 = list;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f104725OooOo, this.f104727OooOoO0, continuation);
            oooO00o.f104726OooOo0o = obj;
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
            ((C24334OooO0O0) this.f104726OooOo0o).OooO0oO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.f75137o00oO0o, this.f104725OooOo.f75150OooOOO0.toJson(this.f104727OooOoO0));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oo.o0000o0$OooO0O0 */
    public static final class OooO0O0<T> implements Comparator {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f104728OooOo0o;

        public OooO0O0(ArrayList arrayList) {
            this.f104728OooOo0o = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String id = ((PenInfo) t).getId();
            ArrayList arrayList = this.f104728OooOo0o;
            return C24536OooO0Oo.OooO0O0(Integer.valueOf(arrayList.indexOf(id)), Integer.valueOf(arrayList.indexOf(((PenInfo) t2).getId())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29525o0000o0(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f104722OooOo = oooO0O0;
        this.f104724OooOoO0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29525o0000o0(this.f104722OooOo, this.f104724OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29525o0000o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104723OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f104722OooOo;
            OooO00o oooO00o = new OooO00o(oooO0O0, oOo000Oo.OooOo.o00O0O(oOo000Oo.OooOo.o0ooOO0((Iterable) oooO0O0.f75198o000oOoO.f121747OooOo0o.getValue()), new OooO0O0(this.f104724OooOoO0)), null);
            this.f104723OooOo0o = 1;
            if (C24332OooO.OooO00o(oooO0O0.f75146OooOO0, oooO00o, this) == enumC32485OooO00o) {
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
