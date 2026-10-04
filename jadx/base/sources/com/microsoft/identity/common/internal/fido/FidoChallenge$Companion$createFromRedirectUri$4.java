package com.microsoft.identity.common.internal.fido;

import com.microsoft.identity.common.internal.fido.FidoChallengeField;
import kotlin.Metadata;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
public /* synthetic */ class FidoChallenge$Companion$createFromRedirectUri$4 extends C24019OooOO0o implements InterfaceC32508OooOOOo<FidoRequestField, String, String> {
    public FidoChallenge$Companion$createFromRedirectUri$4(Object obj) {
        super(2, obj, FidoChallengeField.Companion.class, "throwIfInvalidProtocolVersion", "throwIfInvalidProtocolVersion(Lcom/microsoft/identity/common/internal/fido/FidoRequestField;Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final String invoke(FidoRequestField p0, String str) {
        OooOOO0.OooO0oO(p0, "p0");
        return ((FidoChallengeField.Companion) this.receiver).throwIfInvalidProtocolVersion(p0, str);
    }
}
