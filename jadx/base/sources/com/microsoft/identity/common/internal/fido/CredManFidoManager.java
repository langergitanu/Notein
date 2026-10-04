package com.microsoft.identity.common.internal.fido;

import android.content.Context;
import android.os.Bundle;
import com.facebook.soloader.OooOo;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0000OO0.C24183Oooo;
import o0000OO0.C24192Oooo0oo;
import o0000OO0.C24196OoooO0O;
import o0000OO0.OooOOO0;
import o0000OO0.OooOOOO;
import o0000OO0.o000oOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/fido/CredManFidoManager;", "Lcom/microsoft/identity/common/internal/fido/IFidoManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", ClientData.KEY_CHALLENGE, "relyingPartyIdentifier", "", "allowedCredentials", "userVerificationPolicy", "authenticate", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lo0000OO0/OooOOO0;", "credentialManager", "Lo0000OO0/OooOOO0;", "getCredentialManager", "()Lo0000OO0/OooOOO0;", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class CredManFidoManager implements IFidoManager {
    private final Context context;
    private final OooOOO0 credentialManager;

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.fido.CredManFidoManager$authenticate$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.microsoft.identity.common.internal.fido.CredManFidoManager", m80623f = "CredManFidoManager.kt", m80624l = {60}, m80625m = "authenticate")
    public static final class C185941 extends AbstractC32479OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C185941(Continuation<? super C185941> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CredManFidoManager.this.authenticate(null, null, null, null, this);
        }
    }

    public CredManFidoManager(Context context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        this.context = context;
        this.credentialManager = new OooOOOO(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.microsoft.identity.common.internal.fido.IFidoManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object authenticate(String str, String str2, List<String> list, String str3, Continuation<? super String> continuation) throws Throwable {
        C185941 c185941;
        if (continuation instanceof C185941) {
            c185941 = (C185941) continuation;
            int i = c185941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c185941.label = i - Integer.MIN_VALUE;
            } else {
                c185941 = new C185941(continuation);
            }
        }
        Object objOooO0O0 = c185941.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c185941.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            String requestJson = WebAuthnJsonUtil.INSTANCE.createJsonAuthRequest(str, str2, list, str3);
            C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            Bundle bundle2 = new Bundle();
            bundle2.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
            bundle2.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle2.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            C24192Oooo0oo c24192Oooo0oo = new C24192Oooo0oo(OooOo.OooO0oO(new C24196OoooO0O(requestJson, c34438OooOoo0, bundle, bundle2)));
            OooOOO0 oooOOO0 = this.credentialManager;
            Context context = this.context;
            c185941.label = 1;
            objOooO0O0 = oooOOO0.OooO0O0(context, c24192Oooo0oo, c185941);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        return WebAuthnJsonUtil.INSTANCE.extractAuthenticatorAssertionResponseJson(((o000oOoO) ((C24183Oooo) objOooO0O0).f81438OooO00o).f81448OooO00o);
    }

    public final Context getContext() {
        return this.context;
    }

    public final OooOOO0 getCredentialManager() {
        return this.credentialManager;
    }
}
