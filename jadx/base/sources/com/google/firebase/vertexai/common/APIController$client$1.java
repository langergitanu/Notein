package com.google.firebase.vertexai.common;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0Ooo0oO.C29437OooOO0O;
import oO000o0.C32093OooO0oO;
import oO000oOO.C32116OooO0O0;
import oO00OOOo.OooO0OO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0Ooo0O.C33419OoooO0;
import oO0o0O.C33549OooO00o;
import oO0o0O.EnumC33551OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO000o0/OooO0oO;", "LoO00ooO/OooOooO;", "invoke", "(LoO000o0/OooO0oO;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
public final class APIController$client$1 extends OooOOOO implements InterfaceC32507OooOO0o<C32093OooO0oO<?>, C32460OooOooO> {
    final /* synthetic */ APIController this$0;

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$client$1$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0Ooo0O/OoooO0$OooO00o;", "LoO00ooO/OooOooO;", "invoke", "(LoO0Ooo0O/OoooO0$OooO00o;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C172371 extends OooOOOO implements InterfaceC32507OooOO0o<C33419OoooO0.OooO00o, C32460OooOooO> {
        final /* synthetic */ APIController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C172371(APIController aPIController) {
            super(1);
            this.this$0 = aPIController;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(C33419OoooO0.OooO00o oooO00o) {
            invoke2(oooO00o);
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C33419OoooO0.OooO00o install) {
            OooOOO0.OooO0oO(install, "$this$install");
            Long lValueOf = Long.valueOf(C33549OooO00o.OooO0Oo(this.this$0.requestOptions.getTimeout()));
            C33419OoooO0.OooO00o.OooO00o(lValueOf);
            install.f120814OooO00o = lValueOf;
            Long lValueOf2 = Long.valueOf(Math.max(C33549OooO00o.OooO0Oo(C29437OooOO0O.OooO0o(180, EnumC33551OooO0OO.f121152OooOoO)), C33549OooO00o.OooO0Oo(this.this$0.requestOptions.getTimeout())));
            C33419OoooO0.OooO00o.OooO00o(lValueOf2);
            install.f120816OooO0OO = lValueOf2;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$client$1$2 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO000oOO/OooO0O0$OooO00o;", "LoO00ooO/OooOooO;", "invoke", "(LoO000oOO/OooO0O0$OooO00o;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C172382 extends OooOOOO implements InterfaceC32507OooOO0o<C32116OooO0O0.OooO00o, C32460OooOooO> {
        public static final C172382 INSTANCE = new C172382();

        public C172382() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(C32116OooO0O0.OooO00o oooO00o) {
            invoke2(oooO00o);
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C32116OooO0O0.OooO00o install) {
            OooOOO0.OooO0oO(install, "$this$install");
            OooO0OO.OooO00o(install, APIControllerKt.getJSON(), 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APIController$client$1(APIController aPIController) {
        super(1);
        this.this$0 = aPIController;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public /* bridge */ /* synthetic */ C32460OooOooO invoke(C32093OooO0oO<?> c32093OooO0oO) {
        invoke2(c32093OooO0oO);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C32093OooO0oO<?> HttpClient) {
        OooOOO0.OooO0oO(HttpClient, "$this$HttpClient");
        HttpClient.OooO00o(C33419OoooO0.f120809OooO0Oo, new C172371(this.this$0));
        HttpClient.OooO00o(C32116OooO0O0.f115147OooO0OO, C172382.INSTANCE);
    }
}
