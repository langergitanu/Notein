package o0OO0Ooo;

import OooOoOO.C20519OooO0Oo;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.drive.Drive;
import com.orion.notein.domain.models.cloudsync.CloudAuthResult;
import com.orion.notein.global.R;
import java.util.concurrent.atomic.AtomicBoolean;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OO0Ooo.Oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26773Oooo0 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f92579OooO0oo = C24340OooO0oo.OooO00o("google_drive_opened");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f92580OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f92581OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f92582OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C26759OooOOoo f92583OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C32447OooOOo f92584OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f92585OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C32447OooOOo f92586OooO0oO;

    public C26773Oooo0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, o0000o0O.OooOO0 preferences, o0000o0O.OooOO0 legacyPreferences, C26759OooOOoo cloudService) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(preferences, "preferences");
        kotlin.jvm.internal.OooOOO0.OooO0oO(legacyPreferences, "legacyPreferences");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudService, "cloudService");
        this.f92580OooO00o = abstractApplicationC26277OooOoOO;
        this.f92581OooO0O0 = preferences;
        this.f92582OooO0OO = legacyPreferences;
        this.f92583OooO0Oo = cloudService;
        this.f92585OooO0o0 = new AtomicBoolean(false);
        this.f92584OooO0o = C20519OooO0Oo.OooO0OO(new C26761OooOo0());
        this.f92586OooO0oO = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0OO0Ooo.OooOo0O
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                C26773Oooo0 c26773Oooo0 = this.f92546OooOo0o;
                return GoogleSignIn.getClient(c26773Oooo0.f92580OooO00o, (GoogleSignInOptions) c26773Oooo0.f92584OooO0o.getValue());
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:
    
        if (o0000oOO.C24332OooO.OooO00o(r9, r10, r0) != r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C26773Oooo0 c26773Oooo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26774Oooo000 c26774Oooo000;
        Boolean bool;
        c26773Oooo0.getClass();
        if (abstractC32479OooO0OO instanceof C26774Oooo000) {
            c26774Oooo000 = (C26774Oooo000) abstractC32479OooO0OO;
            int i = c26774Oooo000.f92589OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26774Oooo000.f92589OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26774Oooo000 = new C26774Oooo000(c26773Oooo0, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c26774Oooo000.f92587OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26774Oooo000.f92589OooOoO;
        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = f92579OooO0oo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            if (c26773Oooo0.f92585OooO0o0.getAndSet(true)) {
                return C32460OooOooO.f116667OooO00o;
            }
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = c26773Oooo0.f92581OooO0O0.getData();
            c26774Oooo000.f92588OooOo0o = c26773Oooo0;
            c26774Oooo000.f92589OooOoO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(data, c26774Oooo000);
            if (objOooOOo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            c26773Oooo0 = c26774Oooo000.f92588OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        } else {
            if (i2 == 2) {
                c26773Oooo0 = c26774Oooo000.f92588OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOo);
                bool = (Boolean) ((AbstractC24338OooO0o0) objOooOOo).OooO0OO(oooO00o);
                if (bool != null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                boolean zBooleanValue = bool.booleanValue();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("GoogleDriveSession");
                c20358OooO00o.OooO0o0("migrateLegacy: copying google_drive_opened=%s from legacy store", bool);
                o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = c26773Oooo0.f92581OooO0O0;
                C26775Oooo00O c26775Oooo00O = new C26775Oooo00O(zBooleanValue, null);
                c26774Oooo000.f92588OooOo0o = c26773Oooo0;
                c26774Oooo000.f92589OooOoO = 3;
                if (C24332OooO.OooO00o(oooOO02, c26775Oooo00O, c26774Oooo000) != enumC32485OooO00o) {
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO03 = c26773Oooo0.f92582OooO0OO;
                    C26776Oooo00o c26776Oooo00o = new C26776Oooo00o(2, null);
                    c26774Oooo000.f92588OooOo0o = null;
                    c26774Oooo000.f92589OooOoO = 4;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooOOo);
                return C32460OooOooO.f116667OooO00o;
            }
            c26773Oooo0 = c26774Oooo000.f92588OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO032 = c26773Oooo0.f92582OooO0OO;
            C26776Oooo00o c26776Oooo00o2 = new C26776Oooo00o(2, null);
            c26774Oooo000.f92588OooOo0o = null;
            c26774Oooo000.f92589OooOoO = 4;
        }
        if (((Boolean) ((AbstractC24338OooO0o0) objOooOOo).OooO0OO(oooO00o)) != null) {
            return C32460OooOooO.f116667OooO00o;
        }
        InterfaceC33721OooO0o<AbstractC24338OooO0o0> data2 = c26773Oooo0.f92582OooO0OO.getData();
        c26774Oooo000.f92588OooOo0o = c26773Oooo0;
        c26774Oooo000.f92589OooOoO = 2;
        objOooOOo = C25252OooO0Oo.OooOOo(data2, c26774Oooo000);
        if (objOooOOo != enumC32485OooO00o) {
            bool = (Boolean) ((AbstractC24338OooO0o0) objOooOOo).OooO0OO(oooO00o);
            if (bool != null) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26764OooOo0o c26764OooOo0o;
        C26773Oooo0 c26773Oooo0;
        if (abstractC32479OooO0OO instanceof C26764OooOo0o) {
            c26764OooOo0o = (C26764OooOo0o) abstractC32479OooO0OO;
            int i = c26764OooOo0o.f92549OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26764OooOo0o.f92549OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26764OooOo0o = new C26764OooOo0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26764OooOo0o.f92547OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26764OooOo0o.f92549OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(this.f92580OooO00o);
                Scope scope = new Scope("https://www.googleapis.com/auth/drive.file");
                if (lastSignedInAccount != null && lastSignedInAccount.getGrantedScopes().contains(scope)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("GoogleDriveSession");
                    c20358OooO00o.OooO0o0("authorize: account valid (%s), initializing drive", lastSignedInAccount.getEmail());
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = this.f92581OooO0O0;
                    C26760OooOo c26760OooOo = new C26760OooOo(2, null);
                    c26764OooOo0o.f92548OooOo0o = this;
                    c26764OooOo0o.f92549OooOoO = 1;
                    if (C24332OooO.OooO00o(oooOO02, c26760OooOo, c26764OooOo0o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    c26773Oooo0 = this;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("GoogleDriveSession");
                c20358OooO00o2.OooO0o0("authorize: account is null or missing scope, requesting user action", new Object[0]);
                Intent signInIntent = ((GoogleSignInClient) this.f92586OooO0oO.getValue()).getSignInIntent();
                kotlin.jvm.internal.OooOOO0.OooO0o(signInIntent, "getSignInIntent(...)");
                return new CloudAuthResult.RequiresUserAction(signInIntent);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26773Oooo0 = c26764OooOo0o.f92548OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c26773Oooo0.OooO0o0();
            return CloudAuthResult.Success.INSTANCE;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("GoogleDriveSession");
            c20358OooO00o3.OooO0Oo(e, "authorize failed", new Object[0]);
            return new CloudAuthResult.Failure(null, e.getMessage(), e, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26766OooOoO0 c26766OooOoO0;
        C26773Oooo0 c26773Oooo0;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C26766OooOoO0) {
            c26766OooOoO0 = (C26766OooOoO0) abstractC32479OooO0OO;
            int i = c26766OooOoO0.f92554OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26766OooOoO0.f92554OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26766OooOoO0 = new C26766OooOoO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26766OooOoO0.f92552OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26766OooOoO0.f92554OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f92583OooO0Oo.f92544OooO00o = null;
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = this.f92581OooO0O0;
            C26765OooOoO c26765OooOoO = new C26765OooOoO(2, null);
            c26766OooOoO0.f92553OooOo0o = this;
            c26766OooOoO0.f92554OooOoO = 1;
            if (C24332OooO.OooO00o(oooOO02, c26765OooOoO, c26766OooOoO0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26773Oooo0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26773Oooo0 = c26766OooOoO0.f92553OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            objOooO00o = ((GoogleSignInClient) c26773Oooo0.f92586OooO0oO.getValue()).signOut();
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("GoogleDriveSession");
            c20358OooO00o.OooO0Oo(thOooO00o, "cancelAuthorization: signOut failed", new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public final Object OooO0Oo() {
        if (GoogleSignIn.getLastSignedInAccount(this.f92580OooO00o) == null) {
            return C32446OooOOOo.OooO00o(new IllegalStateException("Google Drive not authorized"));
        }
        try {
            OooO0o0();
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    public final void OooO0o0() {
        GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(this.f92580OooO00o);
        if (lastSignedInAccount == null) {
            throw new IllegalStateException("Google account not signed in");
        }
        GoogleAccountCredential googleAccountCredentialUsingOAuth2 = GoogleAccountCredential.usingOAuth2(this.f92580OooO00o, com.facebook.soloader.OooOo.OooO0oO("https://www.googleapis.com/auth/drive.file"));
        googleAccountCredentialUsingOAuth2.setSelectedAccount(lastSignedInAccount.getAccount());
        Drive driveBuild = new Drive.Builder(GoogleNetHttpTransport.newTrustedTransport(), new GsonFactory(), googleAccountCredentialUsingOAuth2).setApplicationName(this.f92580OooO00o.getString(R.string.app_name)).build();
        C26759OooOOoo c26759OooOOoo = this.f92583OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(driveBuild);
        c26759OooOOoo.getClass();
        c26759OooOOoo.f92544OooO00o = driveBuild;
    }
}
