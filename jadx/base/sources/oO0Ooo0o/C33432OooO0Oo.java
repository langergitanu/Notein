package oO0Ooo0o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33671o00oO0o;

/* JADX INFO: renamed from: oO0Ooo0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33432OooO0Oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f120853OooO0o = AtomicIntegerFieldUpdater.newUpdater(C33432OooO0Oo.class, "requestLogged");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f120854OooO0oO = AtomicIntegerFieldUpdater.newUpdater(C33432OooO0Oo.class, "responseLogged");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33435OooO0oO f120855OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final StringBuilder f120856OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final StringBuilder f120857OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C33671o00oO0o f120858OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33671o00oO0o f120859OooO0o0;
    private volatile /* synthetic */ int requestLogged;
    private volatile /* synthetic */ int responseLogged;

    public C33432OooO0Oo(C33435OooO0oO logger) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(logger, "logger");
        this.f120855OooO00o = logger;
        this.f120856OooO0O0 = new StringBuilder();
        this.f120857OooO0OO = new StringBuilder();
        this.f120858OooO0Oo = oO00o00.OooO0OO.OooO00o();
        this.f120859OooO0o0 = oO00o00.OooO0OO.OooO00o();
        this.requestLogged = 0;
        this.responseLogged = 0;
    }

    public final void OooO00o() {
        C33671o00oO0o c33671o00oO0o = this.f120858OooO0Oo;
        if (f120853OooO0o.compareAndSet(this, 0, 1)) {
            try {
                String string = C33599OooOo0O.Oooooo0(this.f120856OooO0O0).toString();
                if (string.length() > 0) {
                    this.f120855OooO00o.OooO00o(string);
                }
            } finally {
                c33671o00oO0o.complete();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33429OooO00o c33429OooO00o;
        C33432OooO0Oo c33432OooO0Oo;
        if (abstractC32479OooO0OO instanceof C33429OooO00o) {
            c33429OooO00o = (C33429OooO00o) abstractC32479OooO0OO;
            int i = c33429OooO00o.f120841OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33429OooO00o.f120841OooOoO = i - Integer.MIN_VALUE;
            } else {
                c33429OooO00o = new C33429OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c33429OooO00o.f120839OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33429OooO00o.f120841OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (!f120854OooO0oO.compareAndSet(this, 0, 1)) {
                return C32460OooOooO.f116667OooO00o;
            }
            C33671o00oO0o c33671o00oO0o = this.f120858OooO0Oo;
            c33429OooO00o.f120840OooOo0o = this;
            c33429OooO00o.f120841OooOoO = 1;
            if (c33671o00oO0o.join(c33429OooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c33432OooO0Oo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33432OooO0Oo = c33429OooO00o.f120840OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        String string = C33599OooOo0O.Oooooo0(c33432OooO0Oo.f120857OooO0OO).toString();
        if (string.length() > 0) {
            c33432OooO0Oo.f120855OooO00o.OooO00o(string);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33430OooO0O0 c33430OooO0O0;
        C33432OooO0Oo c33432OooO0Oo;
        if (abstractC32479OooO0OO instanceof C33430OooO0O0) {
            c33430OooO0O0 = (C33430OooO0O0) abstractC32479OooO0OO;
            int i = c33430OooO0O0.f120847OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33430OooO0O0.f120847OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c33430OooO0O0 = new C33430OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c33430OooO0O0.f120846OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33430OooO0O0.f120847OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33671o00oO0o c33671o00oO0o = this.f120859OooO0o0;
            c33430OooO0O0.f120844OooOo0o = this;
            c33430OooO0O0.f120843OooOo = str;
            c33430OooO0O0.f120847OooOoOO = 1;
            if (c33671o00oO0o.join(c33430OooO0O0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c33432OooO0Oo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c33430OooO0O0.f120843OooOo;
            c33432OooO0Oo = c33430OooO0O0.f120844OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        c33432OooO0Oo.f120857OooO0OO.append(str);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33431OooO0OO c33431OooO0OO;
        C33432OooO0Oo c33432OooO0Oo;
        if (abstractC32479OooO0OO instanceof C33431OooO0OO) {
            c33431OooO0OO = (C33431OooO0OO) abstractC32479OooO0OO;
            int i = c33431OooO0OO.f120852OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33431OooO0OO.f120852OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c33431OooO0OO = new C33431OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c33431OooO0OO.f120851OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33431OooO0OO.f120852OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33671o00oO0o c33671o00oO0o = this.f120858OooO0Oo;
            c33431OooO0OO.f120849OooOo0o = this;
            c33431OooO0OO.f120848OooOo = str;
            c33431OooO0OO.f120852OooOoOO = 1;
            if (c33671o00oO0o.join(c33431OooO0OO) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c33432OooO0Oo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c33431OooO0OO.f120848OooOo;
            c33432OooO0Oo = c33431OooO0OO.f120849OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        c33432OooO0Oo.f120855OooO00o.OooO00o(C33599OooOo0O.Oooooo0(str).toString());
        return C32460OooOooO.f116667OooO00o;
    }

    public final void OooO0o0(String str) {
        String string = C33599OooOo0O.Oooooo0(str).toString();
        StringBuilder sb = this.f120857OooO0OO;
        sb.append(string);
        sb.append('\n');
        this.f120859OooO0o0.complete();
    }
}
