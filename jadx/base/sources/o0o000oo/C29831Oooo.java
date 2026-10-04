package o0o000oo;

import android.widget.ImageView;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o000oo.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initBtnTiledPage$2", m80623f = "BaseToolbarChildFragment.kt", m80624l = {939}, m80625m = "invokeSuspend")
public final class C29831Oooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105826OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105827OooOo0o;

    /* JADX INFO: renamed from: o0o000oo.Oooo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initBtnTiledPage$2$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteMeta, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ BaseToolbarChildFragment f105828OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f105829OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f105828OooOo = baseToolbarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f105828OooOo, continuation);
            oooO00o.f105829OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(NoteMeta noteMeta, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(noteMeta, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            NoteMeta noteMeta = (NoteMeta) this.f105829OooOo0o;
            ImageView imageView = this.f105828OooOo.f76487Oooo0OO;
            if (imageView != null) {
                imageView.setVisibility((noteMeta == null || !noteMeta.getUnboundedNote()) ? 0 : 8);
                return C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnTiledPage");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29831Oooo(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C29831Oooo> continuation) {
        super(2, continuation);
        this.f105826OooOo = baseToolbarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29831Oooo(this.f105826OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29831Oooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105827OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            BaseToolbarChildFragment baseToolbarChildFragment = this.f105826OooOo;
            com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
            OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
            this.f105827OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(Oooo0OO2.f73395OoooOo0, oooO00o, this) == enumC32485OooO00o) {
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
