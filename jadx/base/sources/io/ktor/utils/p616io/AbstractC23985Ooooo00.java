package io.ktor.utils.p616io;

import Oooo0.o000000;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.content.C21650OooOoO;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.Oooo000;
import o000OO00.C24472OooOoo;
import o00OooO.C25139OooOOOo;
import o00oo0O0.C25667OooOO0o;
import oO00O.OooOO0O;
import oO00O0o.C32177OooO0o0;
import oO00OOoo.C32250OooO0O0;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0.C32269OooO0oo;
import oO00Oo0.OooO00o;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0O.C32273OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: io.ktor.utils.io.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC23985Ooooo00 implements InterfaceC23967Oooo00O, InterfaceC23986Ooooo0o, InterfaceC23990Oooooo, oo0o0Oo, InterfaceC24008o0ooOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f80767OooO0O0 = AtomicLongFieldUpdater.newUpdater(AbstractC23985Ooooo00.class, "_totalBytesRead");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f80768OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f80769OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f80770OooO0o0;
    private volatile /* synthetic */ int _availableForRead;
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _lastReadView;
    private volatile /* synthetic */ long _totalBytesRead;
    private volatile /* synthetic */ long _totalBytesWritten;
    private volatile /* synthetic */ int channelSize;
    private volatile /* synthetic */ int lastReadAvailable$delegate;
    private volatile /* synthetic */ Object lastReadView$delegate;

    static {
        AtomicLongFieldUpdater.newUpdater(AbstractC23985Ooooo00.class, "_totalBytesWritten");
        f80768OooO0OO = AtomicIntegerFieldUpdater.newUpdater(AbstractC23985Ooooo00.class, "_availableForRead");
        f80769OooO0Oo = AtomicIntegerFieldUpdater.newUpdater(AbstractC23985Ooooo00.class, "channelSize");
        f80770OooO0o0 = AtomicReferenceFieldUpdater.newUpdater(AbstractC23985Ooooo00.class, Object.class, "_closed");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object Oooo(AbstractC23985Ooooo00 abstractC23985Ooooo00, byte[] bArr, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23981OoooOOo c23981OoooOOo;
        if (abstractC32479OooO0OO instanceof C23981OoooOOo) {
            c23981OoooOOo = (C23981OoooOOo) abstractC32479OooO0OO;
            int i2 = c23981OoooOOo.f80749OooOoo0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c23981OoooOOo.f80749OooOoo0 = i2 - Integer.MIN_VALUE;
            } else {
                c23981OoooOOo = new C23981OoooOOo(abstractC23985Ooooo00, abstractC32479OooO0OO);
            }
        }
        Object obj = c23981OoooOOo.f80746OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c23981OoooOOo.f80749OooOoo0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (i <= 0) {
                return C32460OooOooO.f116667OooO00o;
            }
            c23981OoooOOo.f80745OooOo0o = abstractC23985Ooooo00;
            c23981OoooOOo.f80744OooOo = bArr;
            c23981OoooOOo.f80747OooOoO0 = i;
            c23981OoooOOo.f80749OooOoo0 = 1;
            if (abstractC23985Ooooo00.Oooo000(1, c23981OoooOOo) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c23981OoooOOo.f80747OooOoO0;
            bArr = c23981OoooOOo.f80744OooOo;
            abstractC23985Ooooo00 = c23981OoooOOo.f80745OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        C25667OooOO0o.OooO0Oo(null, bArr, 0, Math.min(abstractC23985Ooooo00.Oooo0(), i));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, oO00ooO.OooOooO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object Oooo0o(AbstractC23985Ooooo00 abstractC23985Ooooo00, C23974Oooo0oo c23974Oooo0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23976OoooO0 c23976OoooO0;
        AbstractC23985Ooooo00 abstractC23985Ooooo002;
        if (abstractC32479OooO0OO instanceof C23976OoooO0) {
            c23976OoooO0 = (C23976OoooO0) abstractC32479OooO0OO;
            int i = c23976OoooO0.f80728OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23976OoooO0.f80728OooOoO = i - Integer.MIN_VALUE;
            } else {
                c23976OoooO0 = new C23976OoooO0(abstractC23985Ooooo00, abstractC32479OooO0OO);
            }
        }
        Object obj = c23976OoooO0.f80726OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23976OoooO0.f80728OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c23976OoooO0.f80727OooOo0o = abstractC23985Ooooo00;
                c23976OoooO0.f80728OooOoO = 1;
                Object objInvoke = c23974Oooo0oo.invoke(abstractC23985Ooooo00, c23976OoooO0);
                abstractC23985Ooooo002 = abstractC23985Ooooo00;
                if (objInvoke == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC23985Ooooo00 abstractC23985Ooooo003 = c23976OoooO0.f80727OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                abstractC23985Ooooo002 = abstractC23985Ooooo003;
            }
            abstractC23985Ooooo002.Oooo00o();
            abstractC23985Ooooo00 = C32460OooOooO.f116667OooO00o;
            return abstractC23985Ooooo00;
        } catch (Throwable th) {
            abstractC23985Ooooo00.Oooo00o();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object Oooo0o0(AbstractC23985Ooooo00 abstractC23985Ooooo00, byte[] bArr, int i, int i2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23977OoooO00 c23977OoooO00;
        if (abstractC32479OooO0OO instanceof C23977OoooO00) {
            c23977OoooO00 = (C23977OoooO00) abstractC32479OooO0OO;
            int i3 = c23977OoooO00.f80732OooOoO;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23977OoooO00.f80732OooOoO = i3 - Integer.MIN_VALUE;
            } else {
                c23977OoooO00 = new C23977OoooO00(abstractC23985Ooooo00, abstractC32479OooO0OO);
            }
        }
        Object obj = c23977OoooO00.f80730OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c23977OoooO00.f80732OooOoO;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Throwable thOooO0O0 = abstractC23985Ooooo00.OooO0O0();
            if (thOooO0O0 != null) {
                throw thOooO0O0;
            }
            if (abstractC23985Ooooo00.Oooo0O0() && abstractC23985Ooooo00._availableForRead == 0) {
                return new Integer(-1);
            }
            if (i2 == 0) {
                return new Integer(0);
            }
            if (abstractC23985Ooooo00._availableForRead == 0) {
                c23977OoooO00.f80731OooOo0o = abstractC23985Ooooo00;
                c23977OoooO00.f80732OooOoO = 1;
                abstractC23985Ooooo00.Oooo00O(1, c23977OoooO00);
                return enumC32485OooO00o;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC23985Ooooo00 = c23977OoooO00.f80731OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        abstractC23985Ooooo00.getClass();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object Oooo0oO(AbstractC23985Ooooo00 abstractC23985Ooooo00, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23978OoooO0O c23978OoooO0O;
        StringBuilder sb;
        if (abstractC32479OooO0OO instanceof C23978OoooO0O) {
            c23978OoooO0O = (C23978OoooO0O) abstractC32479OooO0OO;
            int i2 = c23978OoooO0O.f80736OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c23978OoooO0O.f80736OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c23978OoooO0O = new C23978OoooO0O(abstractC23985Ooooo00, abstractC32479OooO0OO);
            }
        }
        Object obj = c23978OoooO0O.f80734OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c23978OoooO0O.f80736OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            StringBuilder sb2 = new StringBuilder();
            c23978OoooO0O.f80735OooOo0o = sb2;
            c23978OoooO0O.f80736OooOoO = 1;
            Object objOooO = abstractC23985Ooooo00.OooO(sb2, i, c23978OoooO0O);
            if (objOooO == obj2) {
                return obj2;
            }
            obj = objOooO;
            sb = sb2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb = c23978OoooO0O.f80735OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Oooo0oo(AbstractC23985Ooooo00 abstractC23985Ooooo00, byte b, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000oOoO o000oooo2;
        if (abstractC32479OooO0OO instanceof o000oOoO) {
            o000oooo2 = (o000oOoO) abstractC32479OooO0OO;
            int i = o000oooo2.f80870OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oooo2.f80870OooOoO = i - Integer.MIN_VALUE;
            } else {
                o000oooo2 = new o000oOoO(abstractC23985Ooooo00, abstractC32479OooO0OO);
            }
        }
        Object obj = o000oooo2.f80868OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000oooo2.f80870OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o000oooo2.f80869OooOo0o = abstractC23985Ooooo00;
            o000oooo2.f80870OooOoO = 1;
            if (abstractC23985Ooooo00.Oooo000(1, o000oooo2) == enumC32485OooO00o) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC23985Ooooo00 = o000oooo2.f80869OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        abstractC23985Ooooo00.getClass();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OoooO(AbstractC23985Ooooo00 abstractC23985Ooooo00, short s, AbstractC32479OooO0OO abstractC32479OooO0OO) throws C32269OooO0oo {
        C23984OoooOoo c23984OoooOoo;
        if (abstractC32479OooO0OO instanceof C23984OoooOoo) {
            c23984OoooOoo = (C23984OoooOoo) abstractC32479OooO0OO;
            int i = c23984OoooOoo.f80766OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23984OoooOoo.f80766OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c23984OoooOoo = new C23984OoooOoo(abstractC23985Ooooo00, abstractC32479OooO0OO);
            }
        }
        Object obj = c23984OoooOoo.f80765OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23984OoooOoo.f80766OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c23984OoooOoo.f80763OooOo0o = abstractC23985Ooooo00;
            c23984OoooOoo.f80762OooOo = s;
            c23984OoooOoo.f80766OooOoOO = 1;
            if (abstractC23985Ooooo00.Oooo000(2, c23984OoooOoo) == enumC32485OooO00o) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s = c23984OoooOoo.f80762OooOo;
            abstractC23985Ooooo00 = c23984OoooOoo.f80763OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        abstractC23985Ooooo00.getClass();
        C25139OooOOOo.OooO0o0(null, s);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OoooO0(AbstractC23985Ooooo00 abstractC23985Ooooo00, ByteBuffer src, int i, int i2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23982OoooOo0 c23982OoooOo0;
        if (abstractC32479OooO0OO instanceof C23982OoooOo0) {
            c23982OoooOo0 = (C23982OoooOo0) abstractC32479OooO0OO;
            int i3 = c23982OoooOo0.f80755OooOoo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23982OoooOo0.f80755OooOoo = i3 - Integer.MIN_VALUE;
            } else {
                c23982OoooOo0 = new C23982OoooOo0(abstractC23985Ooooo00, abstractC32479OooO0OO);
            }
        }
        Object obj = c23982OoooOo0.f80754OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c23982OoooOo0.f80755OooOoo;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (i >= i2) {
                return C32460OooOooO.f116667OooO00o;
            }
            c23982OoooOo0.f80751OooOo0o = abstractC23985Ooooo00;
            c23982OoooOo0.f80750OooOo = src;
            c23982OoooOo0.f80753OooOoO0 = i2;
            c23982OoooOo0.f80752OooOoO = i;
            c23982OoooOo0.f80755OooOoo = 1;
            if (abstractC23985Ooooo00.Oooo000(1, c23982OoooOo0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c23982OoooOo0.f80752OooOoO;
            i2 = c23982OoooOo0.f80753OooOoO0;
            src = c23982OoooOo0.f80750OooOo;
            abstractC23985Ooooo00 = c23982OoooOo0.f80751OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        Math.min(abstractC23985Ooooo00.Oooo0(), i2 - i);
        OooOOO0.OooO0oO(null, "$this$writeFully");
        OooOOO0.OooO0oO(src, "src");
        C32273OooO0Oo.OooO0OO(null, 1, null);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OoooO00(AbstractC23985Ooooo00 abstractC23985Ooooo00, C32271OooO00o c32271OooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23980OoooOOO c23980OoooOOO;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof C23980OoooOOO) {
            c23980OoooOOO = (C23980OoooOOO) abstractC32479OooO0OO;
            int i = c23980OoooOOO.f80743OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23980OoooOOO.f80743OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c23980OoooOOO = new C23980OoooOOO(abstractC23985Ooooo00, abstractC32479OooO0OO);
            }
        }
        Object obj = c23980OoooOOO.f80742OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23980OoooOOO.f80743OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c23980OoooOOO.f80740OooOo0o = abstractC23985Ooooo00;
            c23980OoooOOO.f80739OooOo = c32271OooO00o;
            c23980OoooOOO.f80743OooOoOO = 1;
            oooO00o = c32271OooO00o;
            if (abstractC23985Ooooo00.Oooo000(1, c23980OoooOOO) == enumC32485OooO00o) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            OooO00o oooO00o2 = c23980OoooOOO.f80739OooOo;
            abstractC23985Ooooo00 = c23980OoooOOO.f80740OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            oooO00o = oooO00o2;
        }
        int i3 = oooO00o.f115946OooO0OO;
        abstractC23985Ooooo00.getClass();
        OooOOO0.OooO0oO(null, "<this>");
        C32273OooO0Oo.OooO0OO(null, 1, null);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OoooO0O(AbstractC23985Ooooo00 abstractC23985Ooooo00, C32266OooO0Oo c32266OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23983OoooOoO c23983OoooOoO;
        if (abstractC32479OooO0OO instanceof C23983OoooOoO) {
            c23983OoooOoO = (C23983OoooOoO) abstractC32479OooO0OO;
            int i = c23983OoooOoO.f80761OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23983OoooOoO.f80761OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c23983OoooOoO = new C23983OoooOoO(abstractC23985Ooooo00, abstractC32479OooO0OO);
            }
        }
        Object obj = c23983OoooOoO.f80760OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23983OoooOoO.f80761OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c23983OoooOoO.f80758OooOo0o = abstractC23985Ooooo00;
            c23983OoooOoO.f80757OooOo = c32266OooO0Oo;
            c23983OoooOoO.f80761OooOoOO = 1;
            if (abstractC23985Ooooo00.Oooo000(1, c23983OoooOoO) == enumC32485OooO00o) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c32266OooO0Oo = c23983OoooOoO.f80757OooOo;
            abstractC23985Ooooo00 = c23983OoooOoO.f80758OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        c32266OooO0Oo.getClass();
        abstractC23985Ooooo00.getClass();
        throw null;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooO(Appendable appendable, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        if (!OooOoo()) {
            return o000000.OooO00o(appendable, i, new C23975OoooO(this, null), new C23979OoooOO0(this), abstractC32479OooO0OO);
        }
        Throwable thOooO0O0 = OooO0O0();
        if (thOooO0O0 == null) {
            return Boolean.FALSE;
        }
        throw thOooO0O0;
    }

    @Override // io.ktor.utils.p616io.oo0o0Oo
    public final C32271OooO00o OooO00o(int i) throws Throwable {
        Throwable thOooO0O0 = OooO0O0();
        if (thOooO0O0 != null) {
            throw thOooO0O0;
        }
        Oooo00o();
        throw null;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o, io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Throwable OooO0O0() {
        C24010ooOO c24010ooOO = (C24010ooOO) this._closed;
        if (c24010ooOO != null) {
            return c24010ooOO.f80895OooO00o;
        }
        return null;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final int OooO0OO() {
        return this._availableForRead;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final boolean OooO0Oo(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C24010ooOO c24010ooOO = th == null ? o00O0O.f80872OooO00o : new C24010ooOO(th);
        do {
            atomicReferenceFieldUpdater = f80770OooO0o0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c24010ooOO)) {
                th.getClass();
                throw null;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return false;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooO0o(byte[] bArr, int i, int i2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return Oooo0o0(this, bArr, i, i2, abstractC32479OooO0OO);
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Object OooO0o0(byte b, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Oooo0oo(this, b, abstractC32479OooO0OO);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // io.ktor.utils.p616io.oo0o0Oo
    public final int OooO0oo(int i) throws Throwable {
        Throwable thOooO0O0 = OooO0O0();
        if (thOooO0O0 != null) {
            throw thOooO0O0;
        }
        if (i == 0) {
            return 0;
        }
        throw null;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Object OooOO0(C32266OooO0Oo c32266OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OoooO0O(this, c32266OooO0Oo, abstractC32479OooO0OO);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // io.ktor.utils.p616io.InterfaceC24008o0ooOO0
    public final oo0o0Oo OooOO0o() {
        return this;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooOOO(long j, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        throw null;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Object OooOOO0(byte[] bArr, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return Oooo(this, bArr, i, abstractC32479OooO0OO);
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Object OooOOOO(C32271OooO00o c32271OooO00o, Continuation continuation) {
        OoooO00(this, c32271OooO00o, (AbstractC32479OooO0OO) continuation);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooOOOo(C32271OooO00o c32271OooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return Oooo0OO(c32271OooO00o, abstractC32479OooO0OO);
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final boolean OooOOo() {
        return false;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Object OooOOo0(ByteBuffer byteBuffer, int i, int i2, C32177OooO0o0 c32177OooO0o0) {
        return OoooO0(this, byteBuffer, i, i2, c32177OooO0o0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOoo(ByteBuffer byteBuffer, long j, long j2, long j3, Continuation continuation) {
        C23973Oooo0oO c23973Oooo0oO;
        Oooo000 oooo000;
        if (continuation instanceof C23973Oooo0oO) {
            c23973Oooo0oO = (C23973Oooo0oO) continuation;
            int i = c23973Oooo0oO.f80714OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23973Oooo0oO.f80714OooOoO = i - Integer.MIN_VALUE;
            } else {
                c23973Oooo0oO = new C23973Oooo0oO(this, (AbstractC32479OooO0OO) continuation);
            }
        }
        Object obj = c23973Oooo0oO.f80712OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23973Oooo0oO.f80714OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Oooo000 oooo0002 = new Oooo000();
            C23974Oooo0oo c23974Oooo0oo = new C23974Oooo0oo(j2, oooo0002, j3, byteBuffer, j, null);
            c23973Oooo0oO.f80713OooOo0o = oooo0002;
            c23973Oooo0oO.f80714OooOoO = 1;
            if (Oooo0o(this, c23974Oooo0oo, c23973Oooo0oO) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooo000 = oooo0002;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooo000 = c23973Oooo0oO.f80713OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        return new Long(oooo000.f80941OooOo0o);
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooOo0(int i, OooOO0O oooOO0O) throws Throwable {
        Throwable thOooO0O0 = OooO0O0();
        if (thOooO0O0 != null) {
            throw thOooO0O0;
        }
        if (Oooo0O0() && this._availableForRead < i) {
            throw new EOFException(C21650OooOoO.OooO00o(i, " bytes required but EOF reached"));
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C32271OooO00o.f115974OooO;
        ByteBuffer byteBuffer = C32250OooO0O0.f115830OooO00o;
        throw null;
    }

    @Override // io.ktor.utils.p616io.oo0o0Oo
    public final Object OooOo00(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "atLeast parameter shouldn't be negative: ").toString());
        }
        if (i > 4088) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "atLeast parameter shouldn't be larger than max buffer size of 4088: ").toString());
        }
        Oooo00o();
        if (i == 0) {
            return Boolean.valueOf(!OooOoo());
        }
        throw null;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooOo0O(long j, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        Throwable thOooO0O0 = OooO0O0();
        if (thOooO0O0 != null) {
            throw thOooO0O0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C32271OooO00o.f115974OooO;
        ByteBuffer byteBuffer = C32250OooO0O0.f115830OooO00o;
        throw null;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooOo0o(Continuation continuation) {
        return Oooo0oO(this, Integer.MAX_VALUE, (AbstractC32479OooO0OO) continuation);
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final Object OooOoO(short s, AbstractC32479OooO0OO abstractC32479OooO0OO) throws C32269OooO0oo {
        OoooO(this, s, abstractC32479OooO0OO);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // io.ktor.utils.p616io.InterfaceC24008o0ooOO0
    public final void OooOoO0() {
        Oooo00o();
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooOoOO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooOo00 = OooOo00(1, abstractC32479OooO0OO);
        return objOooOo00 == EnumC32485OooO00o.f116726OooOo0o ? objOooOo00 : C32460OooOooO.f116667OooO00o;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final boolean OooOoo() {
        C24010ooOO c24010ooOO = (C24010ooOO) this._closed;
        if ((c24010ooOO != null ? c24010ooOO.f80895OooO00o : null) != null) {
            return true;
        }
        return Oooo0O0() && this.channelSize == 0;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final Object OooOoo0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        throw null;
    }

    public final void OooOooO(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Can't read negative amount of bytes: ").toString());
        }
        int i2 = -i;
        f80769OooO0Oo.getAndAdd(this, i2);
        f80767OooO0O0.addAndGet(this, i);
        f80768OooO0OO.getAndAdd(this, i2);
        if (this.channelSize < 0) {
            StringBuilder sb = new StringBuilder("Readable bytes count is negative: ");
            C24472OooOoo.OooO0O0(sb, ", ", " in ", this._availableForRead, i);
            sb.append(this);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (this._availableForRead >= 0) {
            throw null;
        }
        StringBuilder sb2 = new StringBuilder("Readable bytes count is negative: ");
        C24472OooOoo.OooO0O0(sb2, ", ", " in ", this._availableForRead, i);
        sb2.append(this);
        throw new IllegalStateException(sb2.toString().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32460OooOooO OooOooo(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23969Oooo0O0 c23969Oooo0O0;
        AbstractC23985Ooooo00 abstractC23985Ooooo00;
        if (abstractC32479OooO0OO instanceof C23969Oooo0O0) {
            c23969Oooo0O0 = (C23969Oooo0O0) abstractC32479OooO0OO;
            int i2 = c23969Oooo0O0.f80702OooOoOO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c23969Oooo0O0.f80702OooOoOO = i2 - Integer.MIN_VALUE;
            } else {
                c23969Oooo0O0 = new C23969Oooo0O0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c23969Oooo0O0.f80701OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c23969Oooo0O0.f80702OooOoOO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            abstractC23985Ooooo00 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c23969Oooo0O0.f80698OooOo;
            abstractC23985Ooooo00 = c23969Oooo0O0.f80699OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (abstractC23985Ooooo00._availableForRead >= i || abstractC23985Ooooo00.OooOoo()) {
            return C32460OooOooO.f116667OooO00o;
        }
        new C23970Oooo0OO(abstractC23985Ooooo00, i);
        c23969Oooo0O0.f80699OooOo0o = abstractC23985Ooooo00;
        c23969Oooo0O0.f80698OooOo = i;
        c23969Oooo0O0.f80702OooOoOO = 1;
        throw null;
    }

    public final int Oooo0() {
        return Math.max(0, 4088 - this.channelSize);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32460OooOooO Oooo000(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23972Oooo0o0 c23972Oooo0o0;
        AbstractC23985Ooooo00 abstractC23985Ooooo00;
        if (abstractC32479OooO0OO instanceof C23972Oooo0o0) {
            c23972Oooo0o0 = (C23972Oooo0o0) abstractC32479OooO0OO;
            int i2 = c23972Oooo0o0.f80711OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c23972Oooo0o0.f80711OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c23972Oooo0o0 = new C23972Oooo0o0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c23972Oooo0o0.f80710OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c23972Oooo0o0.f80711OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            abstractC23985Ooooo00 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            i = 0;
            abstractC23985Ooooo00 = null;
        }
        if (abstractC23985Ooooo00.Oooo0() >= i || abstractC23985Ooooo00.Oooo0O0()) {
            return C32460OooOooO.f116667OooO00o;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo00O(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23971Oooo0o c23971Oooo0o;
        AbstractC23985Ooooo00 abstractC23985Ooooo00;
        if (abstractC32479OooO0OO instanceof C23971Oooo0o) {
            c23971Oooo0o = (C23971Oooo0o) abstractC32479OooO0OO;
            int i2 = c23971Oooo0o.f80707OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c23971Oooo0o.f80707OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c23971Oooo0o = new C23971Oooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c23971Oooo0o.f80705OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c23971Oooo0o.f80707OooOoO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (i < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            c23971Oooo0o.f80706OooOo0o = this;
            c23971Oooo0o.f80707OooOoO = 1;
            if (OooOooo(i, c23971Oooo0o) == enumC32485OooO00o) {
                return;
            } else {
                abstractC23985Ooooo00 = this;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC23985Ooooo00 = c23971Oooo0o.f80706OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        abstractC23985Ooooo00.getClass();
        throw null;
    }

    public final void Oooo00o() {
        C32271OooO00o c32271OooO00o = (C32271OooO00o) this.lastReadView$delegate;
        int i = this.lastReadAvailable$delegate - (c32271OooO00o.f115946OooO0OO - c32271OooO00o.f115945OooO0O0);
        C32271OooO00o c32271OooO00o2 = (C32271OooO00o) this.lastReadView$delegate;
        C32271OooO00o c32271OooO00o3 = C32271OooO00o.f115978OooOOO0;
        if (c32271OooO00o2 != c32271OooO00o3) {
            C32273OooO0Oo.OooO00o(null, (C32271OooO00o) this.lastReadView$delegate);
            throw null;
        }
        if (i > 0) {
            OooOooO(i);
            throw null;
        }
        this.lastReadAvailable$delegate = 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C32271OooO00o.f115974OooO;
        this.lastReadView$delegate = c32271OooO00o3;
    }

    public final boolean Oooo0O0() {
        return this._closed != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0OO(C32271OooO00o c32271OooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23966Oooo c23966Oooo;
        AbstractC23985Ooooo00 abstractC23985Ooooo00;
        if (abstractC32479OooO0OO instanceof C23966Oooo) {
            c23966Oooo = (C23966Oooo) abstractC32479OooO0OO;
            int i = c23966Oooo.f80695OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23966Oooo.f80695OooOoO = i - Integer.MIN_VALUE;
            } else {
                c23966Oooo = new C23966Oooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c23966Oooo.f80693OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23966Oooo.f80695OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Throwable thOooO0O0 = OooO0O0();
            if (thOooO0O0 != null) {
                throw thOooO0O0;
            }
            if (Oooo0O0() && this._availableForRead == 0) {
                return new Integer(-1);
            }
            if (c32271OooO00o.f115949OooO0o0 - c32271OooO00o.f115946OooO0OO == 0) {
                return new Integer(0);
            }
            if (this._availableForRead == 0) {
                c23966Oooo.f80694OooOo0o = this;
                c23966Oooo.f80695OooOoO = 1;
                Oooo00O(1, c23966Oooo);
                return enumC32485OooO00o;
            }
            abstractC23985Ooooo00 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC23985Ooooo00 = c23966Oooo.f80694OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        abstractC23985Ooooo00.getClass();
        throw null;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23986Ooooo0o
    public final boolean cancel(Throwable th) {
        if (OooO0O0() == null && !Oooo0O0()) {
            if (th == null) {
                th = new CancellationException("Channel cancelled");
            }
            OooO0Oo(th);
        }
        return false;
    }

    @Override // io.ktor.utils.p616io.InterfaceC23990Oooooo
    public final void flush() {
        throw null;
    }
}
