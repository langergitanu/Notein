package o0oOOO0o;

import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0Ooo0Oo.C29404OooO00o;
import o0Ooo0Oo.C29406OooO0OO;
import o0Ooo0oO.C29423OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0oOOO0o.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$initPagePaddingColor$3", m80623f = "PagePaddingFragment.kt", m80624l = {449}, m80625m = "invokeSuspend")
public final class C30833OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PagePaddingFragment f110183OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110184OooOo0o;

    /* JADX INFO: renamed from: o0oOOO0o.OooOO0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$initPagePaddingColor$3$1", m80623f = "PagePaddingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29406OooO0OO>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PagePaddingFragment f110185OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f110186OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PagePaddingFragment pagePaddingFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f110185OooOo = pagePaddingFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f110185OooOo, continuation);
            oooO00o.f110186OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(List<? extends C29406OooO0OO> list, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list = (List) this.f110186OooOo0o;
            C29404OooO00o c29404OooO00o = this.f110185OooOo.f74940Ooooo00;
            if (c29404OooO00o != null) {
                c29404OooO00o.OooO0Oo(list);
                return C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("paddingColorAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30833OooOO0o(PagePaddingFragment pagePaddingFragment, Continuation<? super C30833OooOO0o> continuation) {
        super(2, continuation);
        this.f110183OooOo = pagePaddingFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30833OooOO0o(this.f110183OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30833OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110184OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            PagePaddingFragment pagePaddingFragment = this.f110183OooOo;
            C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
            OooO00o oooO00o = new OooO00o(pagePaddingFragment, null);
            this.f110184OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(c29423OooO00oOooOooO.f104380OooOo0o, oooO00o, this) == enumC32485OooO00o) {
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
