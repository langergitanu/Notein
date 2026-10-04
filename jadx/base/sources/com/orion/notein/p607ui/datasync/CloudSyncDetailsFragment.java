package com.orion.notein.p607ui.datasync;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.search.ViewOnClickListenerC22479OooOOo;
import com.orion.niui.components.button.TextButtonView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.C28160OooOOO0;
import o0Oo0o00.C28161OooOOOO;
import o0Oo0o00.C28164OooOOo0;
import o0Oo0o00.C28166OooOo;
import o0Oo0o00.C28169OooOo0O;
import o0Oo0o00.C28170OooOo0o;
import o0Oo0o00.C28172OooOoO0;
import o0Oo0o00.C28174OooOoo;
import o0Oo0o00.C28201OooooO0;
import o0Oo0o00.C28204Oooooo;
import o0Oo0o00.C28220ooOO;
import o0Oo0o00.ViewOnClickListenerC28147OooO;
import o0Oo0o00.ViewOnClickListenerC28150OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28151OooO0Oo;
import o0Oo0o00.ViewOnClickListenerC28152OooO0o;
import o0Oo0o00.ViewOnClickListenerC28153OooO0o0;
import o0Oo0o00.ViewOnClickListenerC28154OooO0oO;
import o0Oo0o00.ViewOnClickListenerC28155OooO0oo;
import o0Oo0o00.ViewOnClickListenerC28157OooOO0O;
import o0Oo0o00.ViewOnClickListenerC28158OooOO0o;
import o0Oo0o0O.C28221OooO00o;
import o0Oo0o0O.C28222OooO0O0;
import o0oOoOo.C31081Ooooo00;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/datasync/CloudSyncDetailsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CloudSyncDetailsFragment extends Hilt_CloudSyncDetailsFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f71417OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public TextView f71419OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f71420OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public RecyclerView f71421Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f71422Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextButtonView f71423Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f71424Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f71425Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public RecyclerView f71426Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public TextView f71427Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public RecyclerView f71428Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f71429Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TextView f71430Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f71431Oooo0oo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f71418OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28201OooooO0.class), new OooO0O0(), new C23077OooO0Oo(), new OooO0OO());

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final C28222OooO0O0 f71433OoooO00 = new C28222OooO0O0();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final C28222OooO0O0 f71432OoooO0 = new C28222OooO0O0();

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final C28221OooO00o f71434OoooO0O = new C28221OooO00o(C28221OooO00o.C19898OooO00o.f100049OooO00o);

    public interface OooO00o {
        void OooOOO();

        void OooOOo0();
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return CloudSyncDetailsFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return CloudSyncDetailsFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.datasync.CloudSyncDetailsFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23077OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23077OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return CloudSyncDetailsFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r12.invoke(r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r12.invoke(r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(CloudSyncDetailsFragment cloudSyncDetailsFragment, C31081Ooooo00 c31081Ooooo00, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28160OooOOO0 c28160OooOOO0;
        Object objOooO0o;
        if (abstractC32479OooO0OO instanceof C28160OooOOO0) {
            c28160OooOOO0 = (C28160OooOOO0) abstractC32479OooO0OO;
            int i = c28160OooOOO0.f99792OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28160OooOOO0.f99792OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c28160OooOOO0 = new C28160OooOOO0(cloudSyncDetailsFragment, abstractC32479OooO0OO);
            }
        }
        Object obj = c28160OooOOO0.f99791OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28160OooOOO0.f99792OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (c31081Ooooo00.f110928OooO0O0) {
                C28201OooooO0 c28201OooooO0OooOooo = cloudSyncDetailsFragment.OooOooo();
                c28160OooOOO0.f99789OooOo0o = cloudSyncDetailsFragment;
                c28160OooOOO0.f99788OooOo = interfaceC32507OooOO0o;
                c28160OooOOO0.f99792OooOoOO = 2;
                objOooO0o = c28201OooooO0OooOooo.OooO0o(c28160OooOOO0);
                if (objOooO0o != enumC32485OooO00o) {
                    if (objOooO0o instanceof C32445OooOOOO.OooO00o) {
                    }
                    if (OooOOO0.OooO0O0(objOooO0o, Boolean.TRUE)) {
                    }
                }
            } else {
                c28160OooOOO0.f99792OooOoOO = 1;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        interfaceC32507OooOO0o = c28160OooOOO0.f99788OooOo;
        cloudSyncDetailsFragment = c28160OooOOO0.f99789OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO0o = ((C32445OooOOOO) obj).f116639OooOo0o;
        if (objOooO0o instanceof C32445OooOOOO.OooO00o) {
            objOooO0o = null;
        }
        if (OooOOO0.OooO0O0(objOooO0o, Boolean.TRUE)) {
            String string = cloudSyncDetailsFragment.getString(R.string.cloud_sync_tip);
            OooOOO0.OooO0o(string, "getString(...)");
            String string2 = cloudSyncDetailsFragment.getString(R.string.cloud_sync_auth_expired);
            OooOOO0.OooO0o(string2, "getString(...)");
            new TipsDialogFragment(string, string2, new ViewOnClickListenerC26311Ooooooo(), new ViewOnClickListenerC28147OooO(cloudSyncDetailsFragment, 0), null, null, 0, null, 384).show(cloudSyncDetailsFragment.getChildFragmentManager(), "TipsDialogFragment");
            return C32460OooOooO.f116667OooO00o;
        }
        c28160OooOOO0.f99789OooOo0o = null;
        c28160OooOOO0.f99788OooOo = null;
        c28160OooOOO0.f99792OooOoOO = 3;
    }

    public static final void OooOoOO(CloudSyncDetailsFragment cloudSyncDetailsFragment, C31081Ooooo00 c31081Ooooo00, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        Map<String, String> map = c31081Ooooo00.f110931OooO0o;
        if (map.isEmpty()) {
            interfaceC32507OooOO0o.invoke(Boolean.FALSE);
            return;
        }
        String string = cloudSyncDetailsFragment.getString(R.string.cloud_sync_tip);
        OooOOO0.OooO0o(string, "getString(...)");
        String string2 = cloudSyncDetailsFragment.getString(R.string.cloud_remote_has_conflict_with_local, OooOo.o000oOoO(map.values(), null, null, null, new com.orion.notein.data.repo.backup.OooO00o(1), 31));
        OooOOO0.OooO0o(string2, "getString(...)");
        int i = 0;
        new TipsDialogFragment(string, string2, new ViewOnClickListenerC28158OooOO0o(interfaceC32507OooOO0o, i), new ViewOnClickListenerC28150OooO0OO(interfaceC32507OooOO0o, i), null, null, 0, null, 384).show(cloudSyncDetailsFragment.getChildFragmentManager(), "TipsDialogFragment");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo(CloudSyncDetailsFragment cloudSyncDetailsFragment, C31081Ooooo00 c31081Ooooo00, oO0O000o.OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28164OooOOo0 c28164OooOOo0;
        if (abstractC32479OooO0OO instanceof C28164OooOOo0) {
            c28164OooOOo0 = (C28164OooOOo0) abstractC32479OooO0OO;
            int i = c28164OooOOo0.f99807OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28164OooOOo0.f99807OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c28164OooOOo0 = new C28164OooOOo0(cloudSyncDetailsFragment, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c28164OooOOo0.f99806OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28164OooOOo0.f99807OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (!c31081Ooooo00.f110929OooO0OO) {
                oooO00o.invoke();
                return C32460OooOooO.f116667OooO00o;
            }
            C28201OooooO0 c28201OooooO0OooOooo = cloudSyncDetailsFragment.OooOooo();
            c28164OooOOo0.f99804OooOo0o = cloudSyncDetailsFragment;
            c28164OooOOo0.f99803OooOo = oooO00o;
            c28164OooOOo0.f99807OooOoOO = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28220ooOO(c28201OooooO0OooOooo, null), c28164OooOOo0);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO00o = c28164OooOOo0.f99803OooOo;
            cloudSyncDetailsFragment = c28164OooOOo0.f99804OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        if (((Boolean) objOooO0o).booleanValue()) {
            oooO00o.invoke();
            return C32460OooOooO.f116667OooO00o;
        }
        String string = cloudSyncDetailsFragment.getString(R.string.cloud_sync_tip);
        OooOOO0.OooO0o(string, "getString(...)");
        String string2 = cloudSyncDetailsFragment.getString(R.string.cloud_sync_storage_full);
        OooOOO0.OooO0o(string2, "getString(...)");
        new TipsDialogFragment(string, string2, null, null, new ViewOnClickListenerC28157OooOO0O(oooO00o, 0), null, 0, null, 384).show(cloudSyncDetailsFragment.getChildFragmentManager(), "TipsDialogFragment");
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r12.invoke(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r12.invoke(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo0(final CloudSyncDetailsFragment cloudSyncDetailsFragment, C31081Ooooo00 c31081Ooooo00, C28174OooOoo.OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28161OooOOOO c28161OooOOOO;
        final InterfaceC32507OooOO0o interfaceC32507OooOO0o;
        if (abstractC32479OooO0OO instanceof C28161OooOOOO) {
            c28161OooOOOO = (C28161OooOOOO) abstractC32479OooO0OO;
            int i = c28161OooOOOO.f99797OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28161OooOOOO.f99797OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c28161OooOOOO = new C28161OooOOOO(cloudSyncDetailsFragment, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c28161OooOOOO.f99796OooOoO0;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28161OooOOOO.f99797OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (c31081Ooooo00.f110927OooO00o) {
                C28201OooooO0 c28201OooooO0OooOooo = cloudSyncDetailsFragment.OooOooo();
                c28161OooOOOO.f99794OooOo0o = cloudSyncDetailsFragment;
                c28161OooOOOO.f99793OooOo = oooO00o;
                c28161OooOOOO.f99797OooOoOO = 2;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28204Oooooo(c28201OooooO0OooOooo, null), c28161OooOOOO);
                interfaceC32507OooOO0o = oooO00o;
                if (objOooO0o != obj) {
                    if (((Boolean) objOooO0o).booleanValue()) {
                    }
                }
            } else {
                c28161OooOOOO.f99797OooOoOO = 1;
            }
            return obj;
        }
        if (i2 == 1) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
            return C32460OooOooO.f116667OooO00o;
        }
        InterfaceC32507OooOO0o interfaceC32507OooOO0o2 = c28161OooOOOO.f99793OooOo;
        cloudSyncDetailsFragment = c28161OooOOOO.f99794OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        interfaceC32507OooOO0o = interfaceC32507OooOO0o2;
        if (((Boolean) objOooO0o).booleanValue()) {
            String string = cloudSyncDetailsFragment.getString(R.string.cloud_sync_tip);
            OooOOO0.OooO0o(string, "getString(...)");
            String string2 = cloudSyncDetailsFragment.getString(R.string.cloud_sync_only_no_wifi_tip);
            OooOOO0.OooO0o(string2, "getString(...)");
            new TipsDialogFragment(string, string2, null, null, new View.OnClickListener() { // from class: o0Oo0o00.OooOO0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC21987OooOoo viewLifecycleOwner = this.f99781OooOo0o.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28162OooOOOo(interfaceC32507OooOO0o, null), 3);
                }
            }, null, 0, null, 384).show(cloudSyncDetailsFragment.getChildFragmentManager(), "TipsDialogFragment");
            return C32460OooOooO.f116667OooO00o;
        }
        c28161OooOOOO.f99794OooOo0o = null;
        c28161OooOOOO.f99793OooOo = null;
        c28161OooOOOO.f99797OooOoOO = 3;
    }

    public static final void OooOooO(CloudSyncDetailsFragment cloudSyncDetailsFragment, C31081Ooooo00 c31081Ooooo00, oO0O000o.OooO00o oooO00o) {
        if (!c31081Ooooo00.f110930OooO0Oo) {
            oooO00o.invoke();
            return;
        }
        String string = cloudSyncDetailsFragment.getString(R.string.cloud_sync_tip);
        OooOOO0.OooO0o(string, "getString(...)");
        String string2 = cloudSyncDetailsFragment.getString(R.string.cloud_sync_version_incompatible);
        OooOOO0.OooO0o(string2, "getString(...)");
        new TipsDialogFragment(string, string2, null, null, new ViewOnClickListenerC28151OooO0Oo(oooO00o, 0), null, 0, null, 384).show(cloudSyncDetailsFragment.getChildFragmentManager(), "TipsDialogFragment");
    }

    public final C28201OooooO0 OooOooo() {
        return (C28201OooooO0) this.f71418OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_cloud_sync_details, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        OooOooo().OooOOO();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.btn_cancel);
        this.f71417OooOoo = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC22479OooOOo(this, 1));
        C28169OooOo0O c28169OooOo0O = new C28169OooOo0O(this);
        C28221OooO00o c28221OooO00o = this.f71434OoooO0O;
        c28221OooO00o.f100048OooO0O0 = c28169OooOo0O;
        this.f71419OooOooO = (TextView) view.findViewById(R.id.tv_status);
        this.f71420OooOooo = (TextView) view.findViewById(R.id.tv_sync_status_desc);
        this.f71423Oooo000 = (TextButtonView) view.findViewById(R.id.btn_sync_now);
        this.f71424Oooo00O = view.findViewById(R.id.iv_sync_anim);
        TextButtonView textButtonView = this.f71423Oooo000;
        if (textButtonView == null) {
            OooOOO0.OooOOOO("btnSyncNow");
            throw null;
        }
        C28050OooO0OO.OooO00o(textButtonView, 500L, new ViewOnClickListenerC28154OooO0oO(this, 0));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.datasync.OooO00o(this, null), 3);
        View viewFindViewById2 = view.findViewById(R.id.uploading_section);
        this.f71425Oooo00o = (TextView) view.findViewById(R.id.tv_uploading_status);
        this.f71422Oooo0 = view.findViewById(R.id.iv_uploading_expand);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_uploading_files);
        this.f71426Oooo0O0 = recyclerView;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("rvUploadingQueue");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = this.f71426Oooo0O0;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("rvUploadingQueue");
            throw null;
        }
        recyclerView2.setAdapter(this.f71433OoooO00);
        RecyclerView recyclerView3 = this.f71426Oooo0O0;
        if (recyclerView3 == null) {
            OooOOO0.OooOOOO("rvUploadingQueue");
            throw null;
        }
        recyclerView3.setVisibility(8);
        RecyclerView recyclerView4 = this.f71426Oooo0O0;
        if (recyclerView4 == null) {
            OooOOO0.OooOOOO("rvUploadingQueue");
            throw null;
        }
        recyclerView4.setItemAnimator(null);
        View view2 = this.f71422Oooo0;
        if (view2 == null) {
            OooOOO0.OooOOOO("btnUploadingQueueDetails");
            throw null;
        }
        C28050OooO0OO.OooO00o(view2, 500L, new ViewOnClickListenerC28153OooO0o0(this, 0));
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C28172OooOoO0(this, viewFindViewById2, null), 3);
        View viewFindViewById3 = view.findViewById(R.id.downloading_section);
        this.f71427Oooo0OO = (TextView) view.findViewById(R.id.tv_downloading_status);
        this.f71429Oooo0o0 = view.findViewById(R.id.iv_downloading_expand);
        RecyclerView recyclerView5 = (RecyclerView) view.findViewById(R.id.rv_downloading_files);
        this.f71428Oooo0o = recyclerView5;
        if (recyclerView5 == null) {
            OooOOO0.OooOOOO("rvDownloadingQueue");
            throw null;
        }
        recyclerView5.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView6 = this.f71428Oooo0o;
        if (recyclerView6 == null) {
            OooOOO0.OooOOOO("rvDownloadingQueue");
            throw null;
        }
        recyclerView6.setAdapter(this.f71432OoooO0);
        RecyclerView recyclerView7 = this.f71428Oooo0o;
        if (recyclerView7 == null) {
            OooOOO0.OooOOOO("rvDownloadingQueue");
            throw null;
        }
        recyclerView7.setVisibility(8);
        RecyclerView recyclerView8 = this.f71428Oooo0o;
        if (recyclerView8 == null) {
            OooOOO0.OooOOOO("rvDownloadingQueue");
            throw null;
        }
        recyclerView8.setItemAnimator(null);
        View view3 = this.f71429Oooo0o0;
        if (view3 == null) {
            OooOOO0.OooOOOO("btnDownloadingQueueDetails");
            throw null;
        }
        C28050OooO0OO.OooO00o(view3, 500L, new ViewOnClickListenerC28155OooO0oo(this, 0));
        InterfaceC21987OooOoo viewLifecycleOwner3 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new C28170OooOo0o(this, viewFindViewById3, null), 3);
        View viewFindViewById4 = view.findViewById(R.id.issues_section);
        this.f71430Oooo0oO = (TextView) view.findViewById(R.id.tv_issues_status);
        this.f71431Oooo0oo = view.findViewById(R.id.iv_issues_expand);
        RecyclerView recyclerView9 = (RecyclerView) view.findViewById(R.id.rv_issues_files);
        this.f71421Oooo = recyclerView9;
        if (recyclerView9 == null) {
            OooOOO0.OooOOOO("rvIssuesQueue");
            throw null;
        }
        recyclerView9.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView10 = this.f71421Oooo;
        if (recyclerView10 == null) {
            OooOOO0.OooOOOO("rvIssuesQueue");
            throw null;
        }
        recyclerView10.setAdapter(c28221OooO00o);
        RecyclerView recyclerView11 = this.f71421Oooo;
        if (recyclerView11 == null) {
            OooOOO0.OooOOOO("rvIssuesQueue");
            throw null;
        }
        recyclerView11.setVisibility(0);
        RecyclerView recyclerView12 = this.f71421Oooo;
        if (recyclerView12 == null) {
            OooOOO0.OooOOOO("rvIssuesQueue");
            throw null;
        }
        recyclerView12.setItemAnimator(null);
        View view4 = this.f71431Oooo0oo;
        if (view4 == null) {
            OooOOO0.OooOOOO("btnIssuesQueueDetails");
            throw null;
        }
        view4.setActivated(true);
        View view5 = this.f71431Oooo0oo;
        if (view5 == null) {
            OooOOO0.OooOOOO("btnIssuesQueueDetails");
            throw null;
        }
        C28050OooO0OO.OooO00o(view5, 500L, new ViewOnClickListenerC28152OooO0o(this, 0));
        InterfaceC21987OooOoo viewLifecycleOwner4 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner4), null, null, new C28166OooOo(this, viewFindViewById4, null), 3);
    }
}
