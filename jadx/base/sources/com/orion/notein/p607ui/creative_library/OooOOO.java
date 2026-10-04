package com.orion.notein.p607ui.creative_library;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.material.DownloadResult;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import kotlin.coroutines.Continuation;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryListViewModel$handleAuthRequired$1", m80623f = "CreativeLibraryListViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_2, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2, StyleIdentifier.LIST_TABLE_3_ACCENT_3}, m80625m = "invokeSuspend")
public final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DownloadResult.AuthRequired f71119OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71120OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C23033OooOO0o f71121OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(DownloadResult.AuthRequired authRequired, C23033OooOO0o c23033OooOO0o, Continuation<? super OooOOO> continuation) {
        super(2, continuation);
        this.f71119OooOo = authRequired;
        this.f71121OooOoO0 = c23033OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOOO(this.f71119OooOo, this.f71121OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r5.emit(r7, r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r5.emit(r7, r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r5.emit(r1, r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        return r0;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71120OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            DownloadResult.AuthRequired authRequired = this.f71119OooOo;
            boolean z = authRequired instanceof DownloadResult.AuthRequired.NeedLogin;
            C33772OooooOo c33772OooooOo = this.f71121OooOoO0.f71076OooO;
            if (z) {
                C23033OooOO0o.OooO0O0.OooO00o oooO00o = C23033OooOO0o.OooO0O0.OooO00o.f71099OooO00o;
                this.f71120OooOo0o = 1;
            } else if (authRequired instanceof DownloadResult.AuthRequired.NeedVip) {
                C23033OooOO0o.OooO0O0.OooO0OO oooO0OO = C23033OooOO0o.OooO0O0.OooO0OO.f71101OooO00o;
                this.f71120OooOo0o = 2;
            } else {
                if (!(authRequired instanceof DownloadResult.AuthRequired.NeedPurchase)) {
                    throw new C32442OooOO0o();
                }
                DownloadResult.AuthRequired.NeedPurchase needPurchase = (DownloadResult.AuthRequired.NeedPurchase) authRequired;
                C23033OooOO0o.OooO0O0.C23034OooO0Oo c23034OooO0Oo = new C23033OooOO0o.OooO0O0.C23034OooO0Oo(needPurchase.getMaterial().getId(), needPurchase.getPriceCents());
                this.f71120OooOo0o = 3;
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
