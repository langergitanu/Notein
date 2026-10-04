package com.orion.notein.p607ui.user.settings.profile;

import OooO0oO.C20439OooO0oo;
import OooOoo0.OooOo00;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.widget.crop.ImageCropView;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o00o0Oo.C25414OooO00o;
import o00oo0O.EnumC25653OooO0OO;
import o00oo0Oo.C25703OooOo0;
import o00ooO0o.C25763OooO00o;
import o00ooO0o.C25764OooO0O0;
import o0O0oooO.C26320o0000OoO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oO0.OooOO0;
import o0OoO000.ViewOnClickListenerC28535OooOo0;
import o0oOo0o0.InterfaceC30981OooO0OO;
import o0oOoOO0.C31014OooO;
import o0oOoOO0.C31023OooOO0;
import o0oOoo.EnumC31104OooO00o;
import o0oOoo.EnumC31105OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/user/settings/profile/UserAvatarModifyFragment;", "Landroidx/fragment/app/Fragment;", "Lo0oOo0o0/OooO0OO;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class UserAvatarModifyFragment extends Hilt_UserAvatarModifyFragment implements InterfaceC30981OooO0OO {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f80012OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C24568OooO0oO f80013OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public OooO0o.OooO0O0<Intent> f80014OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public ImageCropView f80015OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f80016Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f80017Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f80018Oooo00o;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return UserAvatarModifyFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return UserAvatarModifyFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return UserAvatarModifyFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.profile.UserAvatarModifyFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23901OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public C23901OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            UserAvatarModifyFragment userAvatarModifyFragment = UserAvatarModifyFragment.this;
            Bundle arguments = userAvatarModifyFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + userAvatarModifyFragment + " has null arguments");
        }
    }

    public UserAvatarModifyFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f80013OooOoo0 = new C24568OooO0oO(oooo0.OooO0O0(C31023OooOO0.class), new C23901OooO0Oo());
        this.f80012OooOoo = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO00o(), new OooO0OO(), new OooO0O0());
    }

    @Override // o0oOo0o0.InterfaceC30981OooO0OO
    public final Integer OooO0o() {
        return Integer.valueOf(R.color.notein_backgrounds_grouped_secondary);
    }

    @Override // o0oOo0o0.InterfaceC30981OooO0OO
    public final Integer OooOO0() {
        return Integer.valueOf(R.string.user_avatar_change);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f80014OooOooO = registerForActivityResult(new C20439OooO0oo(), new OooO0o.OooO00o() { // from class: o0oOoOO0.OooO0oO
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                ActivityResult result = (ActivityResult) obj;
                OooOOO0.OooO0oO(result, "result");
                Intent intent = result.f62239OooOo;
                Uri data = intent != null ? intent.getData() : null;
                if (data != null) {
                    ImageCropView imageCropView = this.f110757OooOo0o.f80015OooOooo;
                    if (imageCropView != null) {
                        imageCropView.setImage(data);
                    } else {
                        OooOOO0.OooOOOO("cropImageView");
                        throw null;
                    }
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_image_crop, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f80018Oooo00o = view.findViewById(R.id.cl_avatar_uploading);
        ImageCropView imageCropView = (ImageCropView) view.findViewById(R.id.crop_view);
        this.f80015OooOooo = imageCropView;
        if (imageCropView == null) {
            OooOOO0.OooOOOO("cropImageView");
            throw null;
        }
        imageCropView.f80169OoooOoo = true;
        imageCropView.f80159Oooo0oo = EnumC31104OooO00o.f111001OooOo;
        imageCropView.f80158Oooo0oO = EnumC31105OooO0O0.f111004OooOoO;
        View viewFindViewById = view.findViewById(R.id.btn_confirm);
        this.f80017Oooo00O = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC28535OooOo0(this, 4));
        View viewFindViewById2 = view.findViewById(R.id.btn_import);
        this.f80016Oooo000 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnImport");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new OooOO0(this, 5));
        Uri uri = ((C31023OooOO0) this.f80013OooOoo0.getValue()).f110760OooO00o;
        if (OooOOO0.OooO0O0(uri.getScheme(), "android.resource")) {
            ImageCropView imageCropView2 = this.f80015OooOooo;
            if (imageCropView2 != null) {
                imageCropView2.setImage(uri);
                return;
            } else {
                OooOOO0.OooOOOO("cropImageView");
                throw null;
            }
        }
        C25764OooO0O0 c25764OooO0O0OooO0o = C25764OooO0O0.OooO0o(uri);
        c25764OooO0O0OooO0o.f87937OooO0oo = EnumC25653OooO0OO.f87570OooOoO0;
        C25763OooO00o c25763OooO00oOooO00o = c25764OooO0O0OooO0o.OooO00o();
        C25703OooOo0 c25703OooOo0 = C25703OooOo0.f87726OooOOOo;
        OooOo00.OooO0o0(c25703OooOo0, "ImagePipelineFactory was not initialized!");
        c25703OooOo0.OooO0o0().OooO00o(c25763OooO00oOooO00o, this, null, null, null).OooO0Oo(new C31014OooO(this), C25414OooO00o.f86683OooOo0o);
    }
}
