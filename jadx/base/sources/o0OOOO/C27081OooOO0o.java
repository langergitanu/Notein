package o0OOOO;

import OooOoOO.C20519OooO0Oo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthKt;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0OoO.C33799OooOO0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oo0oO0.InterfaceC34848o00Oo000;

/* JADX INFO: renamed from: o0OOOO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27081OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34848o00Oo000 f94290OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f94291OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f94292OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C32447OooOOo f94293OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33769Ooooo0o f94294OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final FirebaseAuth f94295OooO0o0;

    public C27081OooOO0o(InterfaceC34848o00Oo000 dao, o0000o0O.OooOO0 datastore, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dao, "dao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(datastore, "datastore");
        this.f94290OooO00o = dao;
        this.f94291OooO0O0 = datastore;
        this.f94292OooO0OO = abstractApplicationC26277OooOoOO;
        this.f94293OooO0Oo = C20519OooO0Oo.OooO0OO(new OooO00o());
        this.f94295OooO0o0 = AuthKt.getAuth(Firebase.INSTANCE);
        C33799OooOO0O c33799OooOO0OOooOoO = C25252OooO0Oo.OooOoO(datastore.getData(), new OooOO0O(null, this));
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        this.f94294OooO0o = C25252OooO0Oo.OooOoO0(c33799OooOO0OOooOoO, C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
    }

    public final boolean OooO00o() {
        return ((Boolean) this.f94293OooO0Oo.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        r2 = new o0000OO0.OooOOOO(r8.f94292OooO0OO);
        r10 = new o0000OO0.OooO00o();
        r0.f94280OooOo0o = r8;
        r0.f94279OooOo = r9;
        r0.f94283OooOoOO = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r2.OooO0OO(r10, r0) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
    
        if (oO0o0OO.C33609OooO0oo.OooO0o(r10, r3, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ea, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(final String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27080OooO0oo c27080OooO0oo;
        final C27081OooOO0o c27081OooOO0o;
        List<? extends UserInfo> providerData;
        boolean zOooO00o;
        if (abstractC32479OooO0OO instanceof C27080OooO0oo) {
            c27080OooO0oo = (C27080OooO0oo) abstractC32479OooO0OO;
            int i = c27080OooO0oo.f94283OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27080OooO0oo.f94283OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27080OooO0oo = new C27080OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27080OooO0oo.f94282OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27080OooO0oo.f94283OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "FirebaseUserLocalDataSource", "Sign out user: ", str), new Object[0]);
            FirebaseUser currentUser = this.f94295OooO0o0.getCurrentUser();
            if (currentUser != null && (providerData = currentUser.getProviderData()) != null) {
                List<? extends UserInfo> list = providerData;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((UserInfo) it.next()).getProviderId(), "google.com")) {
                            try {
                                break;
                            } catch (Exception e) {
                                e = e;
                                c27081OooOO0o = this;
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o2.OooOOO0("FirebaseUserLocalDataSource");
                                c20358OooO00o2.OooO0Oo(e, "Failed to clear credential state", new Object[0]);
                            }
                        }
                    }
                }
            }
            c27081OooOO0o = this;
            zOooO00o = c27081OooOO0o.OooO00o();
            FirebaseAuth firebaseAuth = c27081OooOO0o.f94295OooO0o0;
            if (!zOooO00o) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            str = c27080OooO0oo.f94279OooOo;
            c27081OooOO0o = c27080OooO0oo.f94280OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (Exception e2) {
                e = e2;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("FirebaseUserLocalDataSource");
                c20358OooO00o22.OooO0Oo(e, "Failed to clear credential state", new Object[0]);
            }
            zOooO00o = c27081OooOO0o.OooO00o();
            FirebaseAuth firebaseAuth2 = c27081OooOO0o.f94295OooO0o0;
            if (!zOooO00o) {
                kotlin.jvm.internal.OooOOO0.OooO0Oo(firebaseAuth2.signInAnonymously().addOnCompleteListener(new OnCompleteListener() { // from class: o0OOOO.OooO0O0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task it2) {
                        kotlin.jvm.internal.OooOOO0.OooO0oO(it2, "it");
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("FirebaseUserLocalDataSource");
                        C27081OooOO0o c27081OooOO0o2 = this.f94261OooO00o;
                        c20358OooO00o3.OooO0o0("Signed in anonymously. " + c27081OooOO0o2.f94295OooO0o0.getCurrentUser(), new Object[0]);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new OooO(c27081OooOO0o2, str, null), 3);
                    }
                }));
                return C32460OooOooO.f116667OooO00o;
            }
            firebaseAuth2.signOut();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooOO0 oooOO02 = new OooOO0(c27081OooOO0o, str, null);
            c27080OooO0oo.f94280OooOo0o = null;
            c27080OooO0oo.f94279OooOo = null;
            c27080OooO0oo.f94283OooOoOO = 2;
        }
    }
}
