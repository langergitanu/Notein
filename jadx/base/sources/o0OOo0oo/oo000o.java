package o0OOo0oo;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.NoteBundleProcessor", m80623f = "CloudBundleProcessor.kt", m80624l = {244, StyleIdentifier.SUBTLE_REFERENCE}, m80625m = "restoreMetaUnsafe")
public final class oo000o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97671OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27671Ooooooo f97672OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f97673OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CloudMetaExtra f97674OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27671Ooooooo f97675OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f97676OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(C27671Ooooooo c27671Ooooooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97675OooOoOO = c27671Ooooooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97673OooOoO = obj;
        this.f97676OooOoo0 |= Integer.MIN_VALUE;
        return this.f97675OooOoOO.OooOO0(null, null, this);
    }
}
