package o0o00oo;

import android.view.animation.Animation;
import android.widget.ImageView;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import kotlin.coroutines.Continuation;
import o0Oo0o00.C28201OooooO0;
import o0oOoOo.C31033OooO0Oo;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00oo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$initCloudSyncView$2", m80623f = "NoteListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30116OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteListContainerFragment f107221OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f107222OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Animation f107223OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ImageView f107224OooOoO0;

    /* JADX INFO: renamed from: o0o00oo.OooOo0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$initCloudSyncView$2$1", m80623f = "NoteListContainerFragment.kt", m80624l = {904}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteListContainerFragment f107225OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107226OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ Animation f107227OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ImageView f107228OooOoO0;

        /* JADX INFO: renamed from: o0o00oo.OooOo0O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20043OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ Animation f107229OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ ImageView f107230OooOo0o;

            public C20043OooO00o(ImageView imageView, Animation animation) {
                this.f107230OooOo0o = imageView;
                this.f107229OooOo = animation;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                C31033OooO0Oo c31033OooO0Oo = (C31033OooO0Oo) obj;
                ImageView imageView = this.f107230OooOo0o;
                if (c31033OooO0Oo == null) {
                    imageView.clearAnimation();
                    imageView.setImageResource(R.drawable.ic_cloud_sync_disabled);
                    return C32460OooOooO.f116667OooO00o;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "NoteListContainerFragment", "cloudSyncIconVOFlow collect: ");
                C31033OooO0Oo.OooO00o oooO00o = c31033OooO0Oo.f110787OooO00o;
                sbOooO0O0.append(oooO00o);
                c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
                int iOrdinal = oooO00o.ordinal();
                if (iOrdinal == 0) {
                    imageView.clearAnimation();
                    imageView.setImageResource(R.drawable.ic_cloud_sync_disabled);
                } else if (iOrdinal == 1) {
                    imageView.clearAnimation();
                    imageView.setImageResource(R.drawable.ic_cloud_sync_initial);
                } else if (iOrdinal == 2) {
                    imageView.setImageResource(R.drawable.ic_cloud_sync_syncing);
                    imageView.startAnimation(this.f107229OooOo);
                } else if (iOrdinal == 3) {
                    imageView.clearAnimation();
                    imageView.setImageResource(R.drawable.ic_cloud_sync_clean);
                } else if (iOrdinal == 4) {
                    imageView.clearAnimation();
                    imageView.setImageResource(R.drawable.ic_cloud_sync_dirty);
                } else {
                    if (iOrdinal != 5) {
                        throw new C32442OooOO0o();
                    }
                    imageView.clearAnimation();
                    imageView.setImageResource(R.drawable.ic_cloud_sync_error);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteListContainerFragment noteListContainerFragment, ImageView imageView, Animation animation, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107225OooOo = noteListContainerFragment;
            this.f107228OooOoO0 = imageView;
            this.f107227OooOoO = animation;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f107225OooOo, this.f107228OooOoO0, this.f107227OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107226OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C28201OooooO0 c28201OooooO0 = (C28201OooooO0) this.f107225OooOo.f77341Oooo000.getValue();
                C20043OooO00o c20043OooO00o = new C20043OooO00o(this.f107228OooOoO0, this.f107227OooOoO);
                this.f107226OooOo0o = 1;
                if (c28201OooooO0.f99967Oooo0O0.f121747OooOo0o.collect(c20043OooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            throw new C32438OooO0oO();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30116OooOo0O(NoteListContainerFragment noteListContainerFragment, ImageView imageView, Animation animation, Continuation<? super C30116OooOo0O> continuation) {
        super(2, continuation);
        this.f107221OooOo = noteListContainerFragment;
        this.f107224OooOoO0 = imageView;
        this.f107223OooOoO = animation;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30116OooOo0O c30116OooOo0O = new C30116OooOo0O(this.f107221OooOo, this.f107224OooOoO0, this.f107223OooOoO, continuation);
        c30116OooOo0O.f107222OooOo0o = obj;
        return c30116OooOo0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30116OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f107222OooOo0o, null, null, new OooO00o(this.f107221OooOo, this.f107224OooOoO0, this.f107223OooOoO, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
