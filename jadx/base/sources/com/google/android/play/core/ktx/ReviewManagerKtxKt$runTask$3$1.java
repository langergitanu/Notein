package com.google.android.play.core.ktx;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.OooO00o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"T", "", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 7, 1})
public final class ReviewManagerKtxKt$runTask$3$1 extends OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {
    final /* synthetic */ OooO00o<C32460OooOooO> $onCanceled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewManagerKtxKt$runTask$3$1(OooO00o<C32460OooOooO> oooO00o) {
        super(1);
        this.$onCanceled = oooO00o;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final /* bridge */ /* synthetic */ C32460OooOooO invoke(Throwable th) {
        invoke2(th);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$onCanceled.invoke();
    }
}
