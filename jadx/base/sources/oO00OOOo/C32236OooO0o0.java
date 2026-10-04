package oO00OOOo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: oO00OOOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", m80623f = "KotlinxSerializationJsonExtensions.kt", m80624l = {66}, m80625m = "deserialize")
public final class C32236OooO0o0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO f115777OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f115778OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f115779OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32236OooO0o0(OooO oooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f115777OooOo = oooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f115778OooOo0o = obj;
        this.f115779OooOoO0 |= Integer.MIN_VALUE;
        return this.f115777OooOo.OooO00o(null, null, null, this);
    }
}
