package com.orion.notein.data.repo.backup;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22916Oooo0oO implements InterfaceC33721OooO0o<Integer> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f69991OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.data.repo.backup.Oooo0oO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f69992OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.data.repo.backup.Oooo0oO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupRepoImpl$getBackupMode$$inlined$map$1$2", m80623f = "BackupRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19131OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f69993OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f69994OooOo0o;

            public C19131OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f69994OooOo0o = obj;
                this.f69993OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f69992OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19131OooO00o c19131OooO00o;
            if (continuation instanceof C19131OooO00o) {
                c19131OooO00o = (C19131OooO00o) continuation;
                int i = c19131OooO00o.f69993OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19131OooO00o.f69993OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19131OooO00o = new C19131OooO00o(continuation);
                }
            }
            Object obj2 = c19131OooO00o.f69994OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19131OooO00o.f69993OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Integer num = (Integer) ((AbstractC24338OooO0o0) obj).OooO0OO(C22913Oooo0OO.f69977OooO0o0);
                Integer num2 = new Integer(num != null ? num.intValue() : 0);
                c19131OooO00o.f69993OooOo = 1;
                if (this.f69992OooOo0o.emit(num2, c19131OooO00o) == enumC32485OooO00o) {
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

    public C22916Oooo0oO(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f69991OooOo0o = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f69991OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
