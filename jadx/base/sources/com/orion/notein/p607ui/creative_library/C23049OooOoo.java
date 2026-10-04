package com.orion.notein.p607ui.creative_library;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.material.DownloadResult;
import com.orion.notein.p607ui.creative_library.C23047OooOoOO;
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

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreatorProfileViewModel$handleAuthRequired$1", m80623f = "CreatorProfileViewModel.kt", m80624l = {StyleIdentifier.COLORFUL_LIST_ACCENT_6, StyleIdentifier.INTENSE_EMPHASIS, StyleIdentifier.BOOK_TITLE}, m80625m = "invokeSuspend")
public final class C23049OooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DownloadResult.AuthRequired f71230OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71231OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C23047OooOoOO f71232OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23049OooOoo(DownloadResult.AuthRequired authRequired, C23047OooOoOO c23047OooOoOO, Continuation<? super C23049OooOoo> continuation) {
        super(2, continuation);
        this.f71230OooOo = authRequired;
        this.f71232OooOoO0 = c23047OooOoOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23049OooOoo(this.f71230OooOo, this.f71232OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23049OooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
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
        int i = this.f71231OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            DownloadResult.AuthRequired authRequired = this.f71230OooOo;
            boolean z = authRequired instanceof DownloadResult.AuthRequired.NeedLogin;
            C33772OooooOo c33772OooooOo = this.f71232OooOoO0.f71201OooOOO0;
            if (z) {
                C23047OooOoOO.OooO0O0.OooO00o oooO00o = C23047OooOoOO.OooO0O0.OooO00o.f71213OooO00o;
                this.f71231OooOo0o = 1;
            } else if (authRequired instanceof DownloadResult.AuthRequired.NeedVip) {
                C23047OooOoOO.OooO0O0.C19183OooO0O0 c19183OooO0O0 = C23047OooOoOO.OooO0O0.C19183OooO0O0.f71214OooO00o;
                this.f71231OooOo0o = 2;
            } else {
                if (!(authRequired instanceof DownloadResult.AuthRequired.NeedPurchase)) {
                    throw new C32442OooOO0o();
                }
                DownloadResult.AuthRequired.NeedPurchase needPurchase = (DownloadResult.AuthRequired.NeedPurchase) authRequired;
                C23047OooOoOO.OooO0O0.OooO0OO oooO0OO = new C23047OooOoOO.OooO0O0.OooO0OO(needPurchase.getMaterial().getId(), needPurchase.getPriceCents());
                this.f71231OooOo0o = 3;
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
