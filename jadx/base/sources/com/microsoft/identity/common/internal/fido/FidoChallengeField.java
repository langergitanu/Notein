package com.microsoft.identity.common.internal.fido;

import com.microsoft.identity.common.java.exception.ClientException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000  *\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001 B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00018\u0000HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00000\u0006HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\rJJ\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0016\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f¨\u0006!"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/fido/FidoChallengeField;", "K", "", "Lcom/microsoft/identity/common/internal/fido/FidoRequestField;", "field", "value", "Lkotlin/Function2;", "throwIfInvalid", "<init>", "(Lcom/microsoft/identity/common/internal/fido/FidoRequestField;Ljava/lang/Object;LoO0O000o/OooOOOo;)V", "component1", "()Lcom/microsoft/identity/common/internal/fido/FidoRequestField;", "component2", "()Ljava/lang/Object;", "component3", "()LoO0O000o/OooOOOo;", "getOrThrow", "copy", "(Lcom/microsoft/identity/common/internal/fido/FidoRequestField;Ljava/lang/Object;LoO0O000o/OooOOOo;)Lcom/microsoft/identity/common/internal/fido/FidoChallengeField;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/microsoft/identity/common/internal/fido/FidoRequestField;", "Ljava/lang/Object;", "LoO0O000o/OooOOOo;", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final /* data */ class FidoChallengeField<K> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final FidoRequestField field;
    private final InterfaceC32508OooOOOo<FidoRequestField, K, K> throwIfInvalid;
    private final K value;

    @Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\r"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/fido/FidoChallengeField$Companion;", "", "()V", "throwIfInvalidOptionalListParameter", "", "", "field", "Lcom/microsoft/identity/common/internal/fido/FidoRequestField;", "value", "throwIfInvalidProtocolVersion", "throwIfInvalidRelyingPartyIdentifier", "throwIfInvalidRequiredParameter", "throwIfInvalidSubmitUrl", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final List<String> throwIfInvalidOptionalListParameter(FidoRequestField field, List<String> value) throws ClientException {
            OooOOO0.OooO0oO(field, "field");
            if (value == null || !(value.isEmpty() || OooOOO0.OooO0O0(OooOo.Oooo0oO(value), ""))) {
                return value;
            }
            throw new ClientException(ClientException.PASSKEY_PROTOCOL_REQUEST_PARSING_ERROR, field.getFieldName() + " is empty");
        }

        public final String throwIfInvalidProtocolVersion(FidoRequestField field, String value) throws ClientException {
            OooOOO0.OooO0oO(field, "field");
            String strThrowIfInvalidRequiredParameter = throwIfInvalidRequiredParameter(field, value);
            if (OooOOO0.OooO0O0(strThrowIfInvalidRequiredParameter, "1.0")) {
                return strThrowIfInvalidRequiredParameter;
            }
            throw new ClientException(ClientException.PASSKEY_PROTOCOL_REQUEST_PARSING_ERROR, "Provided protocol version is not currently supported.");
        }

        public final String throwIfInvalidRelyingPartyIdentifier(FidoRequestField field, String value) throws ClientException {
            OooOOO0.OooO0oO(field, "field");
            return C33599OooOo0O.OoooO0(throwIfInvalidRequiredParameter(field, value), "https://");
        }

        public final String throwIfInvalidRequiredParameter(FidoRequestField field, String value) throws ClientException {
            OooOOO0.OooO0oO(field, "field");
            if (value == null) {
                throw new ClientException(ClientException.PASSKEY_PROTOCOL_REQUEST_PARSING_ERROR, field.getFieldName() + " not provided");
            }
            if (!C33599OooOo0O.Oooo0o0(value)) {
                return value;
            }
            throw new ClientException(ClientException.PASSKEY_PROTOCOL_REQUEST_PARSING_ERROR, field.getFieldName() + " is empty");
        }

        public final String throwIfInvalidSubmitUrl(FidoRequestField field, String value) throws ClientException {
            OooOOO0.OooO0oO(field, "field");
            String strThrowIfInvalidRequiredParameter = throwIfInvalidRequiredParameter(field, value);
            try {
                new URL(strThrowIfInvalidRequiredParameter);
                return strThrowIfInvalidRequiredParameter;
            } catch (MalformedURLException unused) {
                throw new ClientException(ClientException.PASSKEY_PROTOCOL_REQUEST_PARSING_ERROR, "submitUrl value is malformed.");
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FidoChallengeField(FidoRequestField field, K k, InterfaceC32508OooOOOo<? super FidoRequestField, ? super K, ? extends K> throwIfInvalid) {
        OooOOO0.OooO0oO(field, "field");
        OooOOO0.OooO0oO(throwIfInvalid, "throwIfInvalid");
        this.field = field;
        this.value = k;
        this.throwIfInvalid = throwIfInvalid;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final FidoRequestField getField() {
        return this.field;
    }

    private final K component2() {
        return this.value;
    }

    private final InterfaceC32508OooOOOo<FidoRequestField, K, K> component3() {
        return this.throwIfInvalid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FidoChallengeField copy$default(FidoChallengeField fidoChallengeField, FidoRequestField fidoRequestField, Object obj, InterfaceC32508OooOOOo interfaceC32508OooOOOo, int i, Object obj2) {
        if ((i & 1) != 0) {
            fidoRequestField = fidoChallengeField.field;
        }
        if ((i & 2) != 0) {
            obj = fidoChallengeField.value;
        }
        if ((i & 4) != 0) {
            interfaceC32508OooOOOo = fidoChallengeField.throwIfInvalid;
        }
        return fidoChallengeField.copy(fidoRequestField, obj, interfaceC32508OooOOOo);
    }

    public static final List<String> throwIfInvalidOptionalListParameter(FidoRequestField fidoRequestField, List<String> list) throws ClientException {
        return INSTANCE.throwIfInvalidOptionalListParameter(fidoRequestField, list);
    }

    public static final String throwIfInvalidProtocolVersion(FidoRequestField fidoRequestField, String str) throws ClientException {
        return INSTANCE.throwIfInvalidProtocolVersion(fidoRequestField, str);
    }

    public static final String throwIfInvalidRelyingPartyIdentifier(FidoRequestField fidoRequestField, String str) throws ClientException {
        return INSTANCE.throwIfInvalidRelyingPartyIdentifier(fidoRequestField, str);
    }

    public static final String throwIfInvalidRequiredParameter(FidoRequestField fidoRequestField, String str) throws ClientException {
        return INSTANCE.throwIfInvalidRequiredParameter(fidoRequestField, str);
    }

    public static final String throwIfInvalidSubmitUrl(FidoRequestField fidoRequestField, String str) throws ClientException {
        return INSTANCE.throwIfInvalidSubmitUrl(fidoRequestField, str);
    }

    public final FidoChallengeField<K> copy(FidoRequestField field, K value, InterfaceC32508OooOOOo<? super FidoRequestField, ? super K, ? extends K> throwIfInvalid) {
        OooOOO0.OooO0oO(field, "field");
        OooOOO0.OooO0oO(throwIfInvalid, "throwIfInvalid");
        return new FidoChallengeField<>(field, value, throwIfInvalid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FidoChallengeField)) {
            return false;
        }
        FidoChallengeField fidoChallengeField = (FidoChallengeField) other;
        return this.field == fidoChallengeField.field && OooOOO0.OooO0O0(this.value, fidoChallengeField.value) && OooOOO0.OooO0O0(this.throwIfInvalid, fidoChallengeField.throwIfInvalid);
    }

    public final K getOrThrow() throws ClientException {
        return this.throwIfInvalid.invoke(this.field, this.value);
    }

    public int hashCode() {
        int iHashCode = this.field.hashCode() * 31;
        K k = this.value;
        return this.throwIfInvalid.hashCode() + ((iHashCode + (k == null ? 0 : k.hashCode())) * 31);
    }

    public String toString() {
        return "FidoChallengeField(field=" + this.field + ", value=" + this.value + ", throwIfInvalid=" + this.throwIfInvalid + ')';
    }
}
