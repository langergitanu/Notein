package o0o0O000;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O000.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.MoveToFolderFragment$setupCreateFolderSection$3", m80623f = "MoveToFolderFragment.kt", m80624l = {191}, m80625m = "invokeSuspend")
public final class C30231OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ MoveToFolderFragment f107709OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107710OooOo0o;

    /* JADX INFO: renamed from: o0o0O000.OooOoO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.MoveToFolderFragment$setupCreateFolderSection$3$1", m80623f = "MoveToFolderFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ MoveToFolderFragment f107711OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ int f107712OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MoveToFolderFragment moveToFolderFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107711OooOo = moveToFolderFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f107711OooOo, continuation);
            oooO00o.f107712OooOo0o = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Drawable drawableMutate;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            int i = this.f107712OooOo0o;
            MoveToFolderFragment moveToFolderFragment = this.f107711OooOo;
            ImageView imageView = moveToFolderFragment.f77662Oooo;
            if (imageView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("folderColorPreview");
                throw null;
            }
            Drawable drawable = imageView.getDrawable();
            if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            if (drawableMutate instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawableMutate;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.layer_folder_fill);
                Drawable drawableMutate2 = drawableFindDrawableByLayerId != null ? drawableFindDrawableByLayerId.mutate() : null;
                if (drawableMutate2 != null) {
                    Drawable drawableWrap = DrawableCompat.wrap(drawableMutate2);
                    kotlin.jvm.internal.OooOOO0.OooO0o(drawableWrap, "wrap(...)");
                    DrawableCompat.setTint(drawableWrap, i);
                    DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
                    layerDrawable.setDrawableByLayerId(R.id.layer_folder_fill, drawableWrap);
                }
                ImageView imageView2 = moveToFolderFragment.f77662Oooo;
                if (imageView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("folderColorPreview");
                    throw null;
                }
                imageView2.setImageDrawable(drawableMutate);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30231OooOoO0(MoveToFolderFragment moveToFolderFragment, Continuation<? super C30231OooOoO0> continuation) {
        super(2, continuation);
        this.f107709OooOo = moveToFolderFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30231OooOoO0(this.f107709OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30231OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107710OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            MoveToFolderFragment moveToFolderFragment = this.f107709OooOo;
            C30220OooO0oO c30220OooO0oO = (C30220OooO0oO) moveToFolderFragment.f77658OooOoo.getValue();
            OooO00o oooO00o = new OooO00o(moveToFolderFragment, null);
            this.f107710OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(c30220OooO0oO.f107643OooO, oooO00o, this) == enumC32485OooO00o) {
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
