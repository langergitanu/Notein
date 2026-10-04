package com.microsoft.identity.common.internal.fido;

import com.microsoft.identity.common.internal.fido.FidoChallengeField;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
public /* synthetic */ class FidoChallenge$Companion$createFromRedirectUri$7 extends C24019OooOO0o implements InterfaceC32508OooOOOo<FidoRequestField, List<? extends String>, List<? extends String>> {
    public FidoChallenge$Companion$createFromRedirectUri$7(Object obj) {
        super(2, obj, FidoChallengeField.Companion.class, "throwIfInvalidOptionalListParameter", "throwIfInvalidOptionalListParameter(Lcom/microsoft/identity/common/internal/fido/FidoRequestField;Ljava/util/List;)Ljava/util/List;", 0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public /* bridge */ /* synthetic */ List<? extends String> invoke(FidoRequestField fidoRequestField, List<? extends String> list) {
        return invoke2(fidoRequestField, (List<String>) list);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final List<String> invoke2(FidoRequestField p0, List<String> list) {
        OooOOO0.OooO0oO(p0, "p0");
        return ((FidoChallengeField.Companion) this.receiver).throwIfInvalidOptionalListParameter(p0, list);
    }
}
