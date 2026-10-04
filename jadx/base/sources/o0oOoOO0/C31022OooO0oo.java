package o0oOoOO0;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.user.settings.profile.UserAvatarModifyFragment;
import com.orion.notein.p607ui.widget.crop.ImageCropView;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.C26328o0000oOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0oOoOO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.profile.UserAvatarModifyFragment$onModifyConfirm$1", m80623f = "UserAvatarModifyFragment.kt", m80624l = {110}, m80625m = "invokeSuspend")
public final class C31022OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ UserAvatarModifyFragment f110758OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110759OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31022OooO0oo(UserAvatarModifyFragment userAvatarModifyFragment, Continuation<? super C31022OooO0oo> continuation) {
        super(2, continuation);
        this.f110758OooOo = userAvatarModifyFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31022OooO0oo(this.f110758OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31022OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110759OooOo0o;
        UserAvatarModifyFragment userAvatarModifyFragment = this.f110758OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ImageCropView imageCropView = userAvatarModifyFragment.f80015OooOooo;
            if (imageCropView == null) {
                OooOOO0.OooOOOO("cropImageView");
                throw null;
            }
            Bitmap bitmap = imageCropView.getCroppedData().f111183OooO00o;
            if (bitmap == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) userAvatarModifyFragment.f80012OooOoo.getValue();
            this.f110759OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26328o0000oOO(c26320o0000OoO, bitmap, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        View view = userAvatarModifyFragment.f80018Oooo00o;
        if (view == null) {
            OooOOO0.OooOOOO("uploadingView");
            throw null;
        }
        view.setVisibility(8);
        if (iIntValue == 0) {
            Context context = userAvatarModifyFragment.getContext();
            if (context != null) {
                String string = userAvatarModifyFragment.getString(R.string.avatar_modify_success);
                OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
            C21030OooOO0o.OooO0OO(userAvatarModifyFragment).OooOOo0();
        } else if (iIntValue == 10000) {
            View view2 = userAvatarModifyFragment.f80017Oooo00O;
            if (view2 == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            view2.setEnabled(true);
            Context context2 = userAvatarModifyFragment.getContext();
            if (context2 != null) {
                String string2 = userAvatarModifyFragment.getString(R.string.avatar_modify_size_limit);
                OooOOO0.OooO0o(string2, "getString(...)");
                C25206OooO0Oo.OooO0oO(context2, string2);
            }
        } else if (iIntValue != 10001) {
            View view3 = userAvatarModifyFragment.f80017Oooo00O;
            if (view3 == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            view3.setEnabled(true);
            Context context3 = userAvatarModifyFragment.getContext();
            if (context3 != null) {
                String string3 = userAvatarModifyFragment.getString(R.string.avatar_modify_error);
                OooOOO0.OooO0o(string3, "getString(...)");
                C25206OooO0Oo.OooO0oO(context3, string3);
            }
        } else {
            View view4 = userAvatarModifyFragment.f80017Oooo00O;
            if (view4 == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            view4.setEnabled(true);
            Context context4 = userAvatarModifyFragment.getContext();
            if (context4 != null) {
                String string4 = userAvatarModifyFragment.getString(R.string.avatar_modify_size_limit);
                OooOOO0.OooO0o(string4, "getString(...)");
                C25206OooO0Oo.OooO0oO(context4, string4);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
