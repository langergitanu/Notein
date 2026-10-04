package com.orion.notein.p607ui.datasync;

import OooO0oO.C20439OooO0oo;
import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.aspose.words.StyleIdentifier;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.microsoft.identity.client.SignInParameters;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.cloudsync.CloudAuthRequest;
import com.orion.notein.domain.models.cloudsync.CloudAuthResult;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0o0oO.C26014OooO0O0;
import o0OOo0Oo.EnumC27285OooO;
import o0OOooO0.EnumC27953o00000Oo;
import o0Oo00oo.C28039OooO00o;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.C28186Oooo0o0;
import o0Oo0o00.C28188Oooo0oo;
import o0Oo0o00.C28190OoooO0;
import o0Oo0o00.C28194OoooOOO;
import o0Oo0o00.ViewOnClickListenerC28177OooOooo;
import o0Oo0o00.ViewOnClickListenerC28179Oooo0;
import o0Oo0o00.ViewOnClickListenerC28180Oooo000;
import o0Oo0o00.ViewOnClickListenerC28181Oooo00O;
import o0Oo0o00.ViewOnClickListenerC28182Oooo00o;
import o0Oo0o00.ViewOnClickListenerC28183Oooo0O0;
import o0Oo0o00.ViewOnClickListenerC28184Oooo0OO;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/datasync/CloudSyncFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CloudSyncFragment extends Hilt_CloudSyncFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public SwitchMaterial f71438OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public SwitchMaterial f71439OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public SwitchMaterial f71440OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public SwitchMaterial f71441OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C22026ooOO f71442Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public ImageView f71443Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ImageView f71444Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f71445Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f71446Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f71447Oooo0OO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncFragment$onCloudSyncSwitched$1", m80623f = "CloudSyncFragment.kt", m80624l = {224, 226, 235, 238, 241, 245, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, StyleIdentifier.INTENSE_EMPHASIS, StyleIdentifier.GRID_TABLE_4, StyleIdentifier.GRID_TABLE_5_DARK}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public Iterator f71448OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public CloudSyncFragment f71449OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ SwitchMaterial f71450OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f71451OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ CloudSyncFragment f71452OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ EnumC27285OooO f71453OooOoo0;

        /* JADX INFO: renamed from: com.orion.notein.ui.datasync.CloudSyncFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C19192OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final /* synthetic */ int[] f71454OooO00o;

            static {
                int[] iArr = new int[EnumC27285OooO.values().length];
                try {
                    EnumC27285OooO enumC27285OooO = EnumC27285OooO.f95076OooOo0o;
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f71454OooO00o = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(SwitchMaterial switchMaterial, CloudSyncFragment cloudSyncFragment, EnumC27285OooO enumC27285OooO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f71450OooOoO = switchMaterial;
            this.f71452OooOoOO = cloudSyncFragment;
            this.f71453OooOoo0 = enumC27285OooO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f71450OooOoO, this.f71452OooOoOO, this.f71453OooOoo0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
        
            if (r14.OooO0oO(r1, r13) != r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x012f, code lost:
        
            if (r14.OooO0o(r2, r13) == r0) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x016f, code lost:
        
            if (r14.OooO0o(r2, r13) == r0) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0221, code lost:
        
            if (r14.OooO0oO(r1, r13) != r0) goto L95;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x010a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x019e A[PHI: r14
          0x019e: PHI (r14v40 java.lang.Object) = (r14v33 java.lang.Object), (r14v0 java.lang.Object) binds: [B:76:0x019a, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01c1  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Iterator it;
            CloudSyncFragment cloudSyncFragment;
            List listOooOoO;
            Iterator it2;
            CloudAuthRequest cloudAuthRequest;
            CloudAuthResult cloudAuthResult;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71451OooOoO0;
            EnumC27285OooO enumC27285OooO = this.f71453OooOoo0;
            SwitchMaterial switchMaterial = this.f71450OooOoO;
            CloudSyncFragment cloudSyncFragment2 = this.f71452OooOoOO;
            switch (i) {
                case 0:
                    C32446OooOOOo.OooO0O0(obj);
                    if (!switchMaterial.isChecked()) {
                        C28194OoooOOO c28194OoooOOOOooOoo = cloudSyncFragment2.OooOoo();
                        this.f71451OooOoO0 = 1;
                        if (c28194OoooOOOOooOoo.OooO0o(enumC27285OooO, this) != enumC32485OooO00o) {
                            listOooOoO = CloudSyncFragment.OooOoO(cloudSyncFragment2);
                            if ((listOooOoO instanceof Collection) || !listOooOoO.isEmpty()) {
                                it2 = listOooOoO.iterator();
                                while (it2.hasNext()) {
                                    if (((SwitchMaterial) ((C32443OooOOO) it2.next()).f116638OooOo0o).isChecked()) {
                                        return C32460OooOooO.f116667OooO00o;
                                    }
                                }
                            }
                            C28194OoooOOO c28194OoooOOOOooOoo2 = cloudSyncFragment2.OooOoo();
                            EnumC27285OooO enumC27285OooO2 = EnumC27285OooO.f95076OooOo0o;
                            this.f71451OooOoO0 = 2;
                            break;
                        }
                        return enumC32485OooO00o;
                    }
                    List listOooOoO2 = CloudSyncFragment.OooOoO(cloudSyncFragment2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listOooOoO2) {
                        C32443OooOOO c32443OooOOO = (C32443OooOOO) obj2;
                        SwitchMaterial switchMaterial2 = (SwitchMaterial) c32443OooOOO.f116638OooOo0o;
                        if (((EnumC27285OooO) c32443OooOOO.f116637OooOo) != enumC27285OooO && switchMaterial2.isChecked()) {
                            arrayList.add(obj2);
                        }
                    }
                    it = arrayList.iterator();
                    cloudSyncFragment = cloudSyncFragment2;
                    while (true) {
                        if (it.hasNext()) {
                            this.f71449OooOo0o = null;
                            this.f71448OooOo = null;
                            this.f71451OooOoO0 = 4;
                            obj = CloudSyncFragment.OooOoo0(cloudSyncFragment2, 9, this);
                            if (obj != enumC32485OooO00o) {
                            }
                        } else {
                            C32443OooOOO c32443OooOOO2 = (C32443OooOOO) it.next();
                            SwitchMaterial switchMaterial3 = (SwitchMaterial) c32443OooOOO2.f116638OooOo0o;
                            EnumC27285OooO enumC27285OooO3 = (EnumC27285OooO) c32443OooOOO2.f116637OooOo;
                            switchMaterial3.setChecked(false);
                            C28194OoooOOO c28194OoooOOOOooOoo3 = cloudSyncFragment.OooOoo();
                            this.f71449OooOo0o = cloudSyncFragment;
                            this.f71448OooOo = it;
                            this.f71451OooOoO0 = 3;
                            if (c28194OoooOOOOooOoo3.OooO0o(enumC27285OooO3, this) == enumC32485OooO00o) {
                            }
                        }
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        C28194OoooOOO c28194OoooOOOOooOoo4 = cloudSyncFragment2.OooOoo();
                        this.f71451OooOoO0 = 6;
                        if (c28194OoooOOOOooOoo4.OooO0oO(enumC27285OooO, this) != enumC32485OooO00o) {
                            if (C19192OooO00o.f71454OooO00o[enumC27285OooO.ordinal()] != 1) {
                                ActivityC21897OooOo0 activity = cloudSyncFragment2.getActivity();
                                if (activity == null) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o.OooOOO0("CloudSyncFragment");
                                    c20358OooO00o.OooO0OO("Activity is null, abort OneDrive authorization", new Object[0]);
                                    switchMaterial.setChecked(false);
                                    C28194OoooOOO c28194OoooOOOOooOoo5 = cloudSyncFragment2.OooOoo();
                                    this.f71451OooOoO0 = 7;
                                } else {
                                    cloudAuthRequest = new CloudAuthRequest(SignInParameters.builder().withActivity(activity));
                                }
                            } else {
                                cloudAuthRequest = null;
                            }
                            C28194OoooOOO c28194OoooOOOOooOoo6 = cloudSyncFragment2.OooOoo();
                            this.f71451OooOoO0 = 8;
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28190OoooO0(c28194OoooOOOOooOoo6, enumC27285OooO, cloudAuthRequest, null), this);
                            if (obj != enumC32485OooO00o) {
                                cloudAuthResult = (CloudAuthResult) obj;
                                if (OooOOO0.OooO0O0(cloudAuthResult, CloudAuthResult.Success.INSTANCE)) {
                                    if (!(cloudAuthResult instanceof CloudAuthResult.RequiresUserAction)) {
                                        if (!(cloudAuthResult instanceof CloudAuthResult.Failure)) {
                                            throw new C32442OooOO0o();
                                        }
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2.OooOOO0("CloudSyncFragment");
                                        CloudAuthResult.Failure failure = (CloudAuthResult.Failure) cloudAuthResult;
                                        Throwable throwable = failure.getThrowable();
                                        String errorCode = failure.getErrorCode();
                                        if (errorCode == null) {
                                            errorCode = failure.getMessage();
                                        }
                                        c20358OooO00o2.OooO0Oo(throwable, "Cloud sync authorize failed for " + enumC27285OooO + ": " + errorCode, new Object[0]);
                                        switchMaterial.setChecked(false);
                                        C28194OoooOOO c28194OoooOOOOooOoo7 = cloudSyncFragment2.OooOoo();
                                        this.f71451OooOoO0 = 9;
                                        if (c28194OoooOOOOooOoo7.OooO0o(enumC27285OooO, this) != enumC32485OooO00o) {
                                            C28194OoooOOO c28194OoooOOOOooOoo8 = cloudSyncFragment2.OooOoo();
                                            EnumC27285OooO enumC27285OooO4 = EnumC27285OooO.f95076OooOo0o;
                                            this.f71451OooOoO0 = 10;
                                        }
                                    } else {
                                        CloudSyncFragment.OooOoOO(cloudSyncFragment2, enumC27285OooO, ((CloudAuthResult.RequiresUserAction) cloudAuthResult).getIntent());
                                    }
                                    break;
                                } else {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o3.OooOOO0("CloudSyncFragment");
                                    c20358OooO00o3.OooO0o0("Cloud sync authorized successfully for " + enumC27285OooO, new Object[0]);
                                }
                                return C32460OooOooO.f116667OooO00o;
                            }
                        }
                        break;
                    } else {
                        switchMaterial.setChecked(false);
                        C28194OoooOOO c28194OoooOOOOooOoo9 = cloudSyncFragment2.OooOoo();
                        this.f71451OooOoO0 = 5;
                        break;
                    }
                    return enumC32485OooO00o;
                case 1:
                    C32446OooOOOo.OooO0O0(obj);
                    listOooOoO = CloudSyncFragment.OooOoO(cloudSyncFragment2);
                    if (listOooOoO instanceof Collection) {
                    }
                    it2 = listOooOoO.iterator();
                    while (it2.hasNext()) {
                    }
                    C28194OoooOOO c28194OoooOOOOooOoo22 = cloudSyncFragment2.OooOoo();
                    EnumC27285OooO enumC27285OooO22 = EnumC27285OooO.f95076OooOo0o;
                    this.f71451OooOoO0 = 2;
                    break;
                case 2:
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                case 3:
                    it = this.f71448OooOo;
                    cloudSyncFragment = this.f71449OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return enumC32485OooO00o;
                case 4:
                    C32446OooOOOo.OooO0O0(obj);
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return enumC32485OooO00o;
                case 5:
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                case 6:
                    C32446OooOOOo.OooO0O0(obj);
                    if (C19192OooO00o.f71454OooO00o[enumC27285OooO.ordinal()] != 1) {
                    }
                    C28194OoooOOO c28194OoooOOOOooOoo62 = cloudSyncFragment2.OooOoo();
                    this.f71451OooOoO0 = 8;
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28190OoooO0(c28194OoooOOOOooOoo62, enumC27285OooO, cloudAuthRequest, null), this);
                    if (obj != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                case 7:
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                case 8:
                    C32446OooOOOo.OooO0O0(obj);
                    cloudAuthResult = (CloudAuthResult) obj;
                    if (OooOOO0.OooO0O0(cloudAuthResult, CloudAuthResult.Success.INSTANCE)) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                case 9:
                    C32446OooOOOo.OooO0O0(obj);
                    C28194OoooOOO c28194OoooOOOOooOoo82 = cloudSyncFragment2.OooOoo();
                    EnumC27285OooO enumC27285OooO42 = EnumC27285OooO.f95076OooOo0o;
                    this.f71451OooOoO0 = 10;
                    break;
                case 10:
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncFragment$onViewCreated$8", m80623f = "CloudSyncFragment.kt", m80624l = {135}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71456OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncFragment$onViewCreated$8$1", m80623f = "CloudSyncFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CloudSyncFragment f71457OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f71458OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.datasync.CloudSyncFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncFragment$onViewCreated$8$1$1", m80623f = "CloudSyncFragment.kt", m80624l = {137}, m80625m = "invokeSuspend")
            public static final class C19193OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ CloudSyncFragment f71459OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f71460OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.datasync.CloudSyncFragment$OooO0O0$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
                public static final class C19194OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ CloudSyncFragment f71461OooOo0o;

                    public C19194OooO00o(CloudSyncFragment cloudSyncFragment) {
                        this.f71461OooOo0o = cloudSyncFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        EnumC27285OooO enumC27285OooO = (EnumC27285OooO) obj;
                        CloudSyncFragment cloudSyncFragment = this.f71461OooOo0o;
                        SwitchMaterial switchMaterial = cloudSyncFragment.f71439OooOoo0;
                        if (switchMaterial == null) {
                            OooOOO0.OooOOOO("hwSwitch");
                            throw null;
                        }
                        switchMaterial.setChecked(false);
                        SwitchMaterial switchMaterial2 = cloudSyncFragment.f71438OooOoo;
                        if (switchMaterial2 == null) {
                            OooOOO0.OooOOOO("oneDriveSwitch");
                            throw null;
                        }
                        switchMaterial2.setChecked(false);
                        SwitchMaterial switchMaterial3 = cloudSyncFragment.f71440OooOooO;
                        if (switchMaterial3 == null) {
                            OooOOO0.OooOOOO("xiaomiSwitch");
                            throw null;
                        }
                        switchMaterial3.setChecked(false);
                        SwitchMaterial switchMaterial4 = cloudSyncFragment.f71441OooOooo;
                        if (switchMaterial4 == null) {
                            OooOOO0.OooOOOO("googleDriveSwitch");
                            throw null;
                        }
                        switchMaterial4.setChecked(false);
                        int iOrdinal = enumC27285OooO.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                SwitchMaterial switchMaterial5 = cloudSyncFragment.f71439OooOoo0;
                                if (switchMaterial5 == null) {
                                    OooOOO0.OooOOOO("hwSwitch");
                                    throw null;
                                }
                                switchMaterial5.setChecked(true);
                            } else if (iOrdinal == 2) {
                                SwitchMaterial switchMaterial6 = cloudSyncFragment.f71438OooOoo;
                                if (switchMaterial6 == null) {
                                    OooOOO0.OooOOOO("oneDriveSwitch");
                                    throw null;
                                }
                                switchMaterial6.setChecked(true);
                            } else if (iOrdinal == 3) {
                                SwitchMaterial switchMaterial7 = cloudSyncFragment.f71440OooOooO;
                                if (switchMaterial7 == null) {
                                    OooOOO0.OooOOOO("xiaomiSwitch");
                                    throw null;
                                }
                                switchMaterial7.setChecked(true);
                            } else {
                                if (iOrdinal != 4) {
                                    throw new C32442OooOO0o();
                                }
                                SwitchMaterial switchMaterial8 = cloudSyncFragment.f71441OooOooo;
                                if (switchMaterial8 == null) {
                                    OooOOO0.OooOOOO("googleDriveSwitch");
                                    throw null;
                                }
                                switchMaterial8.setChecked(true);
                            }
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19193OooO00o(CloudSyncFragment cloudSyncFragment, Continuation<? super C19193OooO00o> continuation) {
                    super(2, continuation);
                    this.f71459OooOo = cloudSyncFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19193OooO00o(this.f71459OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((C19193OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f71460OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        CloudSyncFragment cloudSyncFragment = this.f71459OooOo;
                        C28194OoooOOO c28194OoooOOOOooOoo = cloudSyncFragment.OooOoo();
                        C19194OooO00o c19194OooO00o = new C19194OooO00o(cloudSyncFragment);
                        this.f71460OooOo0o = 1;
                        if (c28194OoooOOOOooOoo.f99911OooO0oo.f121747OooOo0o.collect(c19194OooO00o, this) == enumC32485OooO00o) {
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

            /* JADX INFO: renamed from: com.orion.notein.ui.datasync.CloudSyncFragment$OooO0O0$OooO00o$OooO0O0, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncFragment$onViewCreated$8$1$2", m80623f = "CloudSyncFragment.kt", m80624l = {165}, m80625m = "invokeSuspend")
            public static final class C19195OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ CloudSyncFragment f71462OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f71463OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.datasync.CloudSyncFragment$OooO0O0$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncFragment$onViewCreated$8$1$2$1", m80623f = "CloudSyncFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
                public static final class C19196OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<EnumC27953o00000Oo, Continuation<? super C32460OooOooO>, Object> {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public final /* synthetic */ CloudSyncFragment f71464OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ Object f71465OooOo0o;

                    /* JADX INFO: renamed from: com.orion.notein.ui.datasync.CloudSyncFragment$OooO0O0$OooO00o$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
                    public /* synthetic */ class C19197OooO00o {

                        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                        public static final /* synthetic */ int[] f71466OooO00o;

                        static {
                            int[] iArr = new int[EnumC27953o00000Oo.values().length];
                            try {
                                EnumC27953o00000Oo enumC27953o00000Oo = EnumC27953o00000Oo.f98991OooOo0o;
                                iArr[0] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            f71466OooO00o = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19196OooO00o(CloudSyncFragment cloudSyncFragment, Continuation<? super C19196OooO00o> continuation) {
                        super(2, continuation);
                        this.f71464OooOo = cloudSyncFragment;
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                        C19196OooO00o c19196OooO00o = new C19196OooO00o(this.f71464OooOo, continuation);
                        c19196OooO00o.f71465OooOo0o = obj;
                        return c19196OooO00o;
                    }

                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(EnumC27953o00000Oo enumC27953o00000Oo, Continuation<? super C32460OooOooO> continuation) {
                        return ((C19196OooO00o) create(enumC27953o00000Oo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        int i = C19197OooO00o.f71466OooO00o[((EnumC27953o00000Oo) this.f71465OooOo0o).ordinal()];
                        CloudSyncFragment cloudSyncFragment = this.f71464OooOo;
                        if (i == 1) {
                            ImageView imageView = cloudSyncFragment.f71443Oooo000;
                            if (imageView == null) {
                                OooOOO0.OooOOOO("ivSyncOnlyOnWifi");
                                throw null;
                            }
                            imageView.setSelected(true);
                            ImageView imageView2 = cloudSyncFragment.f71444Oooo00O;
                            if (imageView2 == null) {
                                OooOOO0.OooOOOO("ivSyncOnWifiAndMobile");
                                throw null;
                            }
                            imageView2.setSelected(false);
                        } else {
                            ImageView imageView3 = cloudSyncFragment.f71443Oooo000;
                            if (imageView3 == null) {
                                OooOOO0.OooOOOO("ivSyncOnlyOnWifi");
                                throw null;
                            }
                            imageView3.setSelected(false);
                            ImageView imageView4 = cloudSyncFragment.f71444Oooo00O;
                            if (imageView4 == null) {
                                OooOOO0.OooOOOO("ivSyncOnWifiAndMobile");
                                throw null;
                            }
                            imageView4.setSelected(true);
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19195OooO0O0(CloudSyncFragment cloudSyncFragment, Continuation<? super C19195OooO0O0> continuation) {
                    super(2, continuation);
                    this.f71462OooOo = cloudSyncFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19195OooO0O0(this.f71462OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19195OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f71463OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        CloudSyncFragment cloudSyncFragment = this.f71462OooOo;
                        C28194OoooOOO c28194OoooOOOOooOoo = cloudSyncFragment.OooOoo();
                        C19196OooO00o c19196OooO00o = new C19196OooO00o(cloudSyncFragment, null);
                        this.f71463OooOo0o = 1;
                        if (C25252OooO0Oo.OooO0oO(c28194OoooOOOOooOoo.f99906OooO, c19196OooO00o, this) == enumC32485OooO00o) {
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

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncFragment$onViewCreated$8$1$3", m80623f = "CloudSyncFragment.kt", m80624l = {180}, m80625m = "invokeSuspend")
            public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ CloudSyncFragment f71467OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f71468OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.datasync.CloudSyncFragment$OooO0O0$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
                public static final class C19198OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ CloudSyncFragment f71469OooOo0o;

                    public C19198OooO00o(CloudSyncFragment cloudSyncFragment) {
                        this.f71469OooOo0o = cloudSyncFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        CloudSyncFragment cloudSyncFragment = this.f71469OooOo0o;
                        if (zBooleanValue) {
                            SwitchMaterial switchMaterial = cloudSyncFragment.f71439OooOoo0;
                            if (switchMaterial == null) {
                                OooOOO0.OooOOOO("hwSwitch");
                                throw null;
                            }
                            switchMaterial.setEnabled(true);
                            SwitchMaterial switchMaterial2 = cloudSyncFragment.f71438OooOoo;
                            if (switchMaterial2 == null) {
                                OooOOO0.OooOOOO("oneDriveSwitch");
                                throw null;
                            }
                            switchMaterial2.setEnabled(true);
                            SwitchMaterial switchMaterial3 = cloudSyncFragment.f71440OooOooO;
                            if (switchMaterial3 == null) {
                                OooOOO0.OooOOOO("xiaomiSwitch");
                                throw null;
                            }
                            switchMaterial3.setEnabled(true);
                            SwitchMaterial switchMaterial4 = cloudSyncFragment.f71441OooOooo;
                            if (switchMaterial4 == null) {
                                OooOOO0.OooOOOO("googleDriveSwitch");
                                throw null;
                            }
                            switchMaterial4.setEnabled(true);
                        } else {
                            SwitchMaterial switchMaterial5 = cloudSyncFragment.f71439OooOoo0;
                            if (switchMaterial5 == null) {
                                OooOOO0.OooOOOO("hwSwitch");
                                throw null;
                            }
                            switchMaterial5.setEnabled(false);
                            SwitchMaterial switchMaterial6 = cloudSyncFragment.f71438OooOoo;
                            if (switchMaterial6 == null) {
                                OooOOO0.OooOOOO("oneDriveSwitch");
                                throw null;
                            }
                            switchMaterial6.setEnabled(false);
                            SwitchMaterial switchMaterial7 = cloudSyncFragment.f71440OooOooO;
                            if (switchMaterial7 == null) {
                                OooOOO0.OooOOOO("xiaomiSwitch");
                                throw null;
                            }
                            switchMaterial7.setEnabled(false);
                            SwitchMaterial switchMaterial8 = cloudSyncFragment.f71441OooOooo;
                            if (switchMaterial8 == null) {
                                OooOOO0.OooOOOO("googleDriveSwitch");
                                throw null;
                            }
                            switchMaterial8.setEnabled(false);
                            Context context = cloudSyncFragment.getContext();
                            if (context != null) {
                                C25206OooO0Oo.OooO0o(context, R.string.cloud_sync_temporarily_unavailable);
                            }
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0OO(CloudSyncFragment cloudSyncFragment, Continuation<? super OooO0OO> continuation) {
                    super(2, continuation);
                    this.f71467OooOo = cloudSyncFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0OO(this.f71467OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f71468OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        CloudSyncFragment cloudSyncFragment = this.f71467OooOo;
                        C28194OoooOOO c28194OoooOOOOooOoo = cloudSyncFragment.OooOoo();
                        C19198OooO00o c19198OooO00o = new C19198OooO00o(cloudSyncFragment);
                        this.f71468OooOo0o = 1;
                        if (c28194OoooOOOOooOoo.f99912OooOO0.f121747OooOo0o.collect(c19198OooO00o, this) == enumC32485OooO00o) {
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
            public OooO00o(CloudSyncFragment cloudSyncFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f71457OooOo = cloudSyncFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f71457OooOo, continuation);
                oooO00o.f71458OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f71458OooOo0o;
                CloudSyncFragment cloudSyncFragment = this.f71457OooOo;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19193OooO00o(cloudSyncFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19195OooO0O0(cloudSyncFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(cloudSyncFragment, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return CloudSyncFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71456OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                CloudSyncFragment cloudSyncFragment = CloudSyncFragment.this;
                OooO00o oooO00o = new OooO00o(cloudSyncFragment, null);
                this.f71456OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(cloudSyncFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return CloudSyncFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.datasync.CloudSyncFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23078OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f71471OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23078OooO0Oo(OooO0OO oooO0OO) {
            super(0);
            this.f71471OooOo0o = oooO0OO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f71471OooOo0o.invoke();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71472OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71472OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71472OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.datasync.CloudSyncFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23079OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71473OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23079OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71473OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f71473OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.datasync.CloudSyncFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23080OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f71474OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23080OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71474OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71474OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? CloudSyncFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public CloudSyncFragment() {
        super(R.layout.fragment_cloud_sync);
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23078OooO0Oo(new OooO0OO()));
        this.f71442Oooo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28194OoooOOO.class), new C23079OooO0o0(interfaceC32440OooOO0OooO0O0), new C23080OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0));
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20439OooO0oo(), new C28186Oooo0o0(this, 0));
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f71446Oooo0O0 = oooO0O0RegisterForActivityResult;
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult2 = registerForActivityResult(new C20439OooO0oo(), new C26014OooO0O0(this));
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult2, "registerForActivityResult(...)");
        this.f71447Oooo0OO = oooO0O0RegisterForActivityResult2;
    }

    public static final List OooOoO(CloudSyncFragment cloudSyncFragment) {
        SwitchMaterial switchMaterial = cloudSyncFragment.f71439OooOoo0;
        if (switchMaterial == null) {
            OooOOO0.OooOOOO("hwSwitch");
            throw null;
        }
        C32443OooOOO c32443OooOOO = new C32443OooOOO(switchMaterial, EnumC27285OooO.f95075OooOo);
        SwitchMaterial switchMaterial2 = cloudSyncFragment.f71438OooOoo;
        if (switchMaterial2 == null) {
            OooOOO0.OooOOOO("oneDriveSwitch");
            throw null;
        }
        C32443OooOOO c32443OooOOO2 = new C32443OooOOO(switchMaterial2, EnumC27285OooO.f95078OooOoO0);
        SwitchMaterial switchMaterial3 = cloudSyncFragment.f71440OooOooO;
        if (switchMaterial3 == null) {
            OooOOO0.OooOOOO("xiaomiSwitch");
            throw null;
        }
        C32443OooOOO c32443OooOOO3 = new C32443OooOOO(switchMaterial3, EnumC27285OooO.f95077OooOoO);
        SwitchMaterial switchMaterial4 = cloudSyncFragment.f71441OooOooo;
        if (switchMaterial4 != null) {
            return C34429OooOOo0.OooOO0o(c32443OooOOO, c32443OooOOO2, c32443OooOOO3, new C32443OooOOO(switchMaterial4, EnumC27285OooO.f95079OooOoOO));
        }
        OooOOO0.OooOOOO("googleDriveSwitch");
        throw null;
    }

    public static final void OooOoOO(CloudSyncFragment cloudSyncFragment, EnumC27285OooO enumC27285OooO, Intent intent) {
        cloudSyncFragment.getClass();
        int iOrdinal = enumC27285OooO.ordinal();
        if (iOrdinal == 1) {
            cloudSyncFragment.f71447Oooo0OO.OooO00o(intent);
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return;
        }
        if (iOrdinal == 4) {
            cloudSyncFragment.f71446Oooo0O0.OooO00o(intent);
            return;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("CloudSyncFragment");
        c20358OooO00o.OooOO0O("No authorization flow defined for " + enumC27285OooO, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo0(CloudSyncFragment cloudSyncFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28188Oooo0oo c28188Oooo0oo;
        boolean zBooleanValue;
        cloudSyncFragment.getClass();
        if (abstractC32479OooO0OO instanceof C28188Oooo0oo) {
            c28188Oooo0oo = (C28188Oooo0oo) abstractC32479OooO0OO;
            int i2 = c28188Oooo0oo.f99886OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28188Oooo0oo.f99886OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c28188Oooo0oo = new C28188Oooo0oo(cloudSyncFragment, abstractC32479OooO0OO);
            }
        }
        C28188Oooo0oo c28188Oooo0oo2 = c28188Oooo0oo;
        Object objShowNonVipFeatureLimitedDialog$default = c28188Oooo0oo2.f99884OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28188Oooo0oo2.f99886OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = cloudSyncFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CloudSyncFragment");
                c20358OooO00o.OooO0o0("showNonVipFeatureLimitedDialog feature=%d, limited=%b", new Integer(i), Boolean.valueOf(zBooleanValue));
                return Boolean.valueOf(zBooleanValue);
            }
            c28188Oooo0oo2.f99885OooOo0o = i;
            c28188Oooo0oo2.f99886OooOoO = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c28188Oooo0oo2, 6, null);
            if (objShowNonVipFeatureLimitedDialog$default == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            i = i;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c28188Oooo0oo2.f99885OooOo0o;
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
        }
        zBooleanValue = ((Boolean) objShowNonVipFeatureLimitedDialog$default).booleanValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("CloudSyncFragment");
        c20358OooO00o2.OooO0o0("showNonVipFeatureLimitedDialog feature=%d, limited=%b", new Integer(i), Boolean.valueOf(zBooleanValue));
        return Boolean.valueOf(zBooleanValue);
    }

    public final C28194OoooOOO OooOoo() {
        return (C28194OoooOOO) this.f71442Oooo0.getValue();
    }

    public final void OooOooO(String str) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("CloudSyncFragment");
        SwitchMaterial switchMaterial = this.f71439OooOoo0;
        if (switchMaterial == null) {
            OooOOO0.OooOOOO("hwSwitch");
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(switchMaterial.isChecked());
        SwitchMaterial switchMaterial2 = this.f71438OooOoo;
        if (switchMaterial2 == null) {
            OooOOO0.OooOOOO("oneDriveSwitch");
            throw null;
        }
        Boolean boolValueOf2 = Boolean.valueOf(switchMaterial2.isChecked());
        SwitchMaterial switchMaterial3 = this.f71440OooOooO;
        if (switchMaterial3 == null) {
            OooOOO0.OooOOOO("xiaomiSwitch");
            throw null;
        }
        Boolean boolValueOf3 = Boolean.valueOf(switchMaterial3.isChecked());
        SwitchMaterial switchMaterial4 = this.f71441OooOooo;
        if (switchMaterial4 != null) {
            c20358OooO00o.OooO0o0("%s onClick, hw isChecked: %b, oneDrive isChecked: %b, xiaomi isChecked: %b, googleDrive isChecked: %b", str, boolValueOf, boolValueOf2, boolValueOf3, Boolean.valueOf(switchMaterial4.isChecked()));
        } else {
            OooOOO0.OooOOOO("googleDriveSwitch");
            throw null;
        }
    }

    public final void OooOooo(SwitchMaterial switchMaterial, EnumC27285OooO enumC27285OooO) {
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(switchMaterial, this, enumC27285OooO, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.hw_cloud_sync_item);
        this.f71445Oooo00o = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("hwCloudSyncItem");
            throw null;
        }
        C28039OooO00o.OooO0O0();
        viewFindViewById.setVisibility(8);
        this.f71443Oooo000 = (ImageView) view.findViewById(R.id.iv_sync_only_on_wifi);
        this.f71444Oooo00O = (ImageView) view.findViewById(R.id.iv_sync_on_wifi_and_mobile_network);
        int i = 0;
        view.findViewById(R.id.cl_sync_only_on_wifi).setOnClickListener(new ViewOnClickListenerC28177OooOooo(this, i));
        view.findViewById(R.id.cl_sync_on_wifi_and_mobile_network).setOnClickListener(new ViewOnClickListenerC28180Oooo000(this, i));
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_helper);
        if (imageView != null) {
            imageView.setOnClickListener(new ViewOnClickListenerC28181Oooo00O(this, 0));
        }
        this.f71439OooOoo0 = (SwitchMaterial) view.findViewById(R.id.switch_sync);
        this.f71438OooOoo = (SwitchMaterial) view.findViewById(R.id.switch_one_drive);
        this.f71440OooOooO = (SwitchMaterial) view.findViewById(R.id.switch_xiaomi_cloud);
        this.f71441OooOooo = (SwitchMaterial) view.findViewById(R.id.switch_google_drive);
        if (!C28039OooO00o.OooO0Oo()) {
            View viewFindViewById2 = view.findViewById(R.id.xiaomi_cloud_item);
            OooOOO0.OooO0Oo(viewFindViewById2);
            viewFindViewById2.setVisibility(8);
        }
        SwitchMaterial switchMaterial = this.f71439OooOoo0;
        if (switchMaterial == null) {
            OooOOO0.OooOOOO("hwSwitch");
            throw null;
        }
        C28050OooO0OO.OooO00o(switchMaterial, 500L, new ViewOnClickListenerC28182Oooo00o(this, 0));
        SwitchMaterial switchMaterial2 = this.f71438OooOoo;
        if (switchMaterial2 == null) {
            OooOOO0.OooOOOO("oneDriveSwitch");
            throw null;
        }
        C28050OooO0OO.OooO00o(switchMaterial2, 500L, new ViewOnClickListenerC28179Oooo0(this, 0));
        SwitchMaterial switchMaterial3 = this.f71440OooOooO;
        if (switchMaterial3 == null) {
            OooOOO0.OooOOOO("xiaomiSwitch");
            throw null;
        }
        C28050OooO0OO.OooO00o(switchMaterial3, 500L, new ViewOnClickListenerC28183Oooo0O0(this, 0));
        SwitchMaterial switchMaterial4 = this.f71441OooOooo;
        if (switchMaterial4 == null) {
            OooOOO0.OooOOOO("googleDriveSwitch");
            throw null;
        }
        C28050OooO0OO.OooO00o(switchMaterial4, 500L, new ViewOnClickListenerC28184Oooo0OO(this, 0));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(null), 3);
    }
}
