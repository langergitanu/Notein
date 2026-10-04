package com.orion.notein.data.repo.backup;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22895OooOOOo implements InterfaceC33721OooO0o<Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f69877OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.data.repo.backup.OooOOOo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f69878OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.data.repo.backup.OooOOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupBaiduDatasource$isAuthorized$$inlined$map$1$2", m80623f = "BackupBaiduDatasource.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19130OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f69879OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f69880OooOo0o;

            public C19130OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f69880OooOo0o = obj;
                this.f69879OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f69878OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19130OooO00o c19130OooO00o;
            if (continuation instanceof C19130OooO00o) {
                c19130OooO00o = (C19130OooO00o) continuation;
                int i = c19130OooO00o.f69879OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19130OooO00o.f69879OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19130OooO00o = new C19130OooO00o(continuation);
                }
            }
            Object obj2 = c19130OooO00o.f69880OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19130OooO00o.f69879OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                String str = (String) obj;
                Boolean boolValueOf = Boolean.valueOf(!(str == null || str.length() == 0));
                c19130OooO00o.f69879OooOo = 1;
                if (this.f69878OooOo0o.emit(boolValueOf, c19130OooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C22895OooOOOo(C33769Ooooo0o c33769Ooooo0o) {
        this.f69877OooOo0o = c33769Ooooo0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f69877OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
