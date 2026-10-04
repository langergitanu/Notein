package o0OO00o0;

import com.orion.notein.data.p602db.entity.HyperLinkEntity;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34757o0000Oo;

/* JADX INFO: renamed from: o0OO00o0.o000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.HyperLinkLocalDataSource$createHyperLink$2", m80623f = "HyperLinkLocalDataSource.kt", m80624l = {31}, m80625m = "invokeSuspend")
public final class C26574o000oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34757o0000Oo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91589OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91590OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f91591OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26574o000oo(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f91591OooOoO0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26574o000oo c26574o000oo = new C26574o000oo(this.f91591OooOoO0, continuation);
        c26574o000oo.f91589OooOo = obj;
        return c26574o000oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34757o0000Oo interfaceC34757o0000Oo, Continuation<? super C32460OooOooO> continuation) {
        return ((C26574o000oo) create(interfaceC34757o0000Oo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91590OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34757o0000Oo interfaceC34757o0000Oo = (InterfaceC34757o0000Oo) this.f91589OooOo;
            HyperLinkEntity[] hyperLinkEntityArr = (HyperLinkEntity[]) this.f91591OooOoO0.toArray(new HyperLinkEntity[0]);
            HyperLinkEntity[] hyperLinkEntityArr2 = (HyperLinkEntity[]) Arrays.copyOf(hyperLinkEntityArr, hyperLinkEntityArr.length);
            this.f91590OooOo0o = 1;
            if (interfaceC34757o0000Oo.OooO00o(hyperLinkEntityArr2, this) == enumC32485OooO00o) {
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
