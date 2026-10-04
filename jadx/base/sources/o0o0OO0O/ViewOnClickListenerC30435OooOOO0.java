package o0o0OO0O;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.OAuthProvider;
import com.google.firebase.auth.UserInfo;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import com.orion.notein.p607ui.user.DeleteAccountAgreementFragment;
import com.orion.notein.p607ui.widget.EdgeFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o0000OO0.C24192Oooo0oo;
import o000o0O0.C24564OooO00o;
import o00o00.C25206OooO0Oo;
import o0Oo00o.C28026OooO0OO;
import o0oOo0.C30915OooO0o;
import o0oOo0.C30918OooO0oo;
import o0oo000O.C31183OooO00o;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OO0O.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC30435OooOOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ EdgeFragment f108695OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f108696OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f108697OooOoO0;

    public /* synthetic */ ViewOnClickListenerC30435OooOOO0(EdgeFragment edgeFragment, Object obj, int i) {
        this.f108696OooOo0o = i;
        this.f108695OooOo = edgeFragment;
        this.f108697OooOoO0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        switch (this.f108696OooOo0o) {
            case 0:
                RecyclerView recyclerView = ((TiledPageListContainerFragment) this.f108695OooOo).f78532Oooo0oo;
                RecyclerView.OooOOOO layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    int itemCount = linearLayoutManager.getItemCount();
                    int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition() + 1;
                    if (iFindFirstVisibleItemPosition < itemCount) {
                        linearLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, 0);
                    }
                    ((ImageView) this.f108697OooOoO0).setEnabled(!(linearLayoutManager.findLastCompletelyVisibleItemPosition() == itemCount - 1));
                    break;
                }
                break;
            default:
                final DeleteAccountAgreementFragment deleteAccountAgreementFragment = (DeleteAccountAgreementFragment) this.f108695OooOo;
                FirebaseUser firebaseUser = (FirebaseUser) this.f108697OooOoO0;
                List<? extends UserInfo> providerData = firebaseUser.getProviderData();
                kotlin.jvm.internal.OooOOO0.OooO0o(providerData, "getProviderData(...)");
                List<? extends UserInfo> list = providerData;
                boolean z3 = true;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = false;
                } else {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((UserInfo) it.next()).getProviderId(), "google.com")) {
                            z = true;
                        }
                    }
                    z = false;
                }
                List<? extends UserInfo> providerData2 = firebaseUser.getProviderData();
                kotlin.jvm.internal.OooOOO0.OooO0o(providerData2, "getProviderData(...)");
                List<? extends UserInfo> list2 = providerData2;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    z2 = false;
                } else {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((UserInfo) it2.next()).getProviderId(), "microsoft.com")) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                List<? extends UserInfo> providerData3 = firebaseUser.getProviderData();
                kotlin.jvm.internal.OooOOO0.OooO0o(providerData3, "getProviderData(...)");
                List<? extends UserInfo> list3 = providerData3;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    z3 = false;
                } else {
                    Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((UserInfo) it3.next()).getProviderId(), "password")) {
                        }
                    }
                    z3 = false;
                }
                if (z) {
                    GetSignInWithGoogleOption getSignInWithGoogleOptionBuild = new GetSignInWithGoogleOption.Builder(C31183OooO00o.f111224OooO0Oo).build();
                    new ArrayList();
                    C24192Oooo0oo c24192Oooo0oo = new C24192Oooo0oo(oOo000Oo.OooOo.o0ooOO0(oOo000Oo.OooOo.o0ooOoO(com.facebook.soloader.OooOo.OooO0oO(getSignInWithGoogleOptionBuild))));
                    InterfaceC21987OooOoo viewLifecycleOwner = deleteAccountAgreementFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30918OooO0oo(deleteAccountAgreementFragment, c24192Oooo0oo, firebaseUser, null), 3);
                } else if (z2) {
                    OAuthProvider.Builder builderNewBuilder = OAuthProvider.newBuilder("microsoft.com");
                    kotlin.jvm.internal.OooOOO0.OooO0o(builderNewBuilder, "newBuilder(...)");
                    builderNewBuilder.addCustomParameter(AuthenticationConstants.AAD.QUERY_PROMPT, "login");
                    Task<AuthResult> taskStartActivityForReauthenticateWithProvider = firebaseUser.startActivityForReauthenticateWithProvider(deleteAccountAgreementFragment.requireActivity(), builderNewBuilder.build());
                    final C30915OooO0o c30915OooO0o = new C30915OooO0o(deleteAccountAgreementFragment, firebaseUser);
                    taskStartActivityForReauthenticateWithProvider.addOnSuccessListener(new OnSuccessListener() { // from class: o0oOo0.OooO0oO
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) {
                            c30915OooO0o.invoke(obj);
                        }
                    }).addOnFailureListener(new OnFailureListener() { // from class: o0oOo0.OooO0O0
                        @Override // com.google.android.gms.tasks.OnFailureListener
                        public final void onFailure(Exception it4) {
                            kotlin.jvm.internal.OooOOO0.OooO0oO(it4, "it");
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("DeleteAccountAgreementFragment");
                            c20358OooO00o.OooO0Oo(it4, "re-auth failed", new Object[0]);
                            DeleteAccountAgreementFragment deleteAccountAgreementFragment2 = deleteAccountAgreementFragment;
                            Context context = deleteAccountAgreementFragment2.getContext();
                            if (context != null) {
                                String string = deleteAccountAgreementFragment2.getString(R.string.login_error_toast_firebase_auth_failed);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                                C25206OooO0Oo.OooO0oO(context, string);
                            }
                        }
                    });
                } else if (!z3) {
                    deleteAccountAgreementFragment.OooOoo0(firebaseUser);
                } else {
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(deleteAccountAgreementFragment), new C24564OooO00o(R.id.f57929x24a891fe));
                }
                break;
        }
    }
}
