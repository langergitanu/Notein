package o00oO00o;

import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.MotionEvent;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import o00o0Ooo.C25428OooO0o;
import o00o0Ooo.C25431OooO0oo;
import o00o0o00.C25438OooO00o;
import o00o0o00.C25439OooO0O0;
import o00o0oo.AbstractC25465OooO0Oo;
import o00o0oo.InterfaceC25467OooO0o0;
import o00oO00O.AbstractC25474OooO00o;
import o00oO00O.C25475OooO0O0;
import o00oO00O.C25476OooO0OO;
import o00oO0O0.C25560OooOOo0;
import o00oOo.C25600OooO00o;
import o00oOoOO.C25619OooO0OO;
import o00oOoOO.InterfaceC25618OooO0O0;
import o00oo.OooO;
import o00ooO.C25732OooO0O0;
import o0oOOo.C30838OooO00o;
import o0ooOO.InterfaceC31496OooO00o;
import o0ooOO.InterfaceC31497OooO0O0;
import o0ooOO.InterfaceC31498OooO0OO;

/* JADX INFO: renamed from: o00oO00o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25477OooO00o<T, INFO> implements InterfaceC31496OooO00o, AbstractC25474OooO00o.InterfaceC19705OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f86821OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25476OooO0OO f86822OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25475OooO0O0 f86823OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00o0Oo.OooO0o f86824OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public InterfaceC25482OooO0o0<INFO> f86825OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public InterfaceC31498OooO0OO f86826OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C25619OooO0OO<INFO> f86827OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C25600OooO00o f86828OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f86829OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f86830OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f86831OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public InterfaceC25467OooO0o0<T> f86832OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f86833OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public T f86834OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Drawable f86835OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Map<String, Object> f86818OooOOOo = C25428OooO0o.OooO00o("component_tag", "drawee");

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final Map<String, Object> f86820OooOOo0 = C25428OooO0o.OooO0O0("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final Class<?> f86819OooOOo = AbstractC25477OooO00o.class;

    /* JADX INFO: renamed from: o00oO00o.OooO00o$OooO00o, reason: collision with other inner class name */
    public final class C19706OooO00o extends AbstractC25465OooO0Oo<Object> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f86836OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ boolean f86837OooO0O0;

        public C19706OooO00o(String str, boolean z) {
            this.f86836OooO00o = str;
            this.f86837OooO0O0 = z;
        }

        @Override // o00o0oo.AbstractC25465OooO0Oo, o00o0oo.InterfaceC25468OooO0oO
        public final void OooO0O0(InterfaceC25467OooO0o0<Object> interfaceC25467OooO0o0) {
            boolean zOooO0OO = interfaceC25467OooO0o0.OooO0OO();
            float fOooO0O0 = interfaceC25467OooO0o0.OooO0O0();
            AbstractC25477OooO00o abstractC25477OooO00o = AbstractC25477OooO00o.this;
            if (!abstractC25477OooO00o.OooOOOO(this.f86836OooO00o, interfaceC25467OooO0o0)) {
                abstractC25477OooO00o.OooOOOo("ignore_old_datasource @ onProgress", null);
                interfaceC25467OooO0o0.close();
            } else {
                if (zOooO0OO) {
                    return;
                }
                abstractC25477OooO00o.f86826OooO0o.OooO0Oo(fOooO0O0, false);
            }
        }

        @Override // o00o0oo.AbstractC25465OooO0Oo
        public final void OooO0Oo(InterfaceC25467OooO0o0<Object> interfaceC25467OooO0o0) {
            AbstractC25477OooO00o.this.OooOo00(this.f86836OooO00o, interfaceC25467OooO0o0, interfaceC25467OooO0o0.OooO00o(), true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // o00o0oo.AbstractC25465OooO0Oo
        public final void OooO0o0(InterfaceC25467OooO0o0<Object> interfaceC25467OooO0o0) {
            boolean zOooO0OO = interfaceC25467OooO0o0.OooO0OO();
            float fOooO0O0 = interfaceC25467OooO0o0.OooO0O0();
            Object result = interfaceC25467OooO0o0.getResult();
            if (result != null) {
                AbstractC25477OooO00o.this.OooOo0O(this.f86836OooO00o, interfaceC25467OooO0o0, result, fOooO0O0, zOooO0OO, this.f86837OooO0O0, false);
            } else if (zOooO0OO) {
                NullPointerException nullPointerException = new NullPointerException();
                AbstractC25477OooO00o.this.OooOo00(this.f86836OooO00o, interfaceC25467OooO0o0, nullPointerException, true);
            }
        }
    }

    /* JADX INFO: renamed from: o00oO00o.OooO00o$OooO0O0 */
    public static class OooO0O0<INFO> extends C25481OooO0o<INFO> {
    }

    public AbstractC25477OooO00o(C25475OooO0O0 c25475OooO0O0, o00o0Oo.OooO0o oooO0o) {
        this.f86822OooO00o = C25476OooO0OO.f86796OooO0OO ? new C25476OooO0OO() : C25476OooO0OO.f86795OooO0O0;
        this.f86827OooO0o0 = new C25619OooO0OO<>();
        this.f86833OooOOO = true;
        this.f86823OooO0O0 = c25475OooO0O0;
        this.f86824OooO0OO = oooO0o;
        OooOOO(null);
    }

    public final InterfaceC25482OooO0o0<INFO> OooO() {
        InterfaceC25482OooO0o0<INFO> interfaceC25482OooO0o0 = this.f86825OooO0Oo;
        return interfaceC25482OooO0o0 == null ? C25480OooO0Oo.f86853OooO00o : interfaceC25482OooO0o0;
    }

    @Override // o0ooOO.InterfaceC31496OooO00o
    public final boolean OooO00o(MotionEvent motionEvent) {
        if (!C25438OooO00o.f86720OooO00o.OooO00o(2)) {
            return false;
        }
        C25438OooO00o.OooO0o(f86819OooOOo, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f86829OooO0oo, motionEvent);
        return false;
    }

    @Override // o0ooOO.InterfaceC31496OooO00o
    public final void OooO0O0() {
        C25732OooO0O0.OooO00o();
        if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
            C25438OooO00o.OooO0o(f86819OooOOo, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f86829OooO0oo, this.f86830OooOO0 ? "request already submitted" : "request needs submit");
        }
        this.f86822OooO00o.OooO00o(C25476OooO0OO.OooO00o.f86803OooOoo);
        this.f86826OooO0o.getClass();
        this.f86823OooO0O0.OooO00o(this);
        this.f86821OooO = true;
        if (!this.f86830OooOO0) {
            C25732OooO0O0.OooO00o();
            T tOooO0oo = OooO0oo();
            C25476OooO0OO c25476OooO0OO = this.f86822OooO00o;
            if (tOooO0oo != null) {
                C25732OooO0O0.OooO00o();
                this.f86832OooOO0o = null;
                this.f86830OooOO0 = true;
                this.f86831OooOO0O = false;
                c25476OooO0OO.OooO00o(C25476OooO0OO.OooO00o.f86817Oooo0oo);
                InterfaceC25467OooO0o0<T> interfaceC25467OooO0o0 = this.f86832OooOO0o;
                OooO oooOOooOO0o = OooOO0o(tOooO0oo);
                OooO().OooO0Oo(this.f86829OooO0oo);
                this.f86827OooO0o0.OooO0O0(this.f86829OooO0oo, OooOOo(interfaceC25467OooO0o0 != null ? interfaceC25467OooO0o0.getExtras() : null, OooOOoo(oooOOooOO0o)));
                OooOo0(tOooO0oo);
                OooOo0O(this.f86829OooO0oo, this.f86832OooOO0o, tOooO0oo, 1.0f, true, true, true);
                C25732OooO0O0.OooO00o();
                C25732OooO0O0.OooO00o();
            } else {
                c25476OooO0OO.OooO00o(C25476OooO0OO.OooO00o.f86809Oooo000);
                this.f86826OooO0o.OooO0Oo(0.0f, true);
                this.f86830OooOO0 = true;
                this.f86831OooOO0O = false;
                InterfaceC25467OooO0o0<T> interfaceC25467OooO0o0OooOO0 = OooOO0();
                this.f86832OooOO0o = interfaceC25467OooO0o0OooOO0;
                OooO().OooO0Oo(this.f86829OooO0oo);
                this.f86827OooO0o0.OooO0O0(this.f86829OooO0oo, OooOOo(interfaceC25467OooO0o0OooOO0 == null ? null : interfaceC25467OooO0o0OooOO0.getExtras(), OooOOoo(null)));
                if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                    C25438OooO00o.OooO0o(f86819OooOOo, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f86829OooO0oo, Integer.valueOf(System.identityHashCode(this.f86832OooOO0o)));
                }
                this.f86832OooOO0o.OooO0Oo(new C19706OooO00o(this.f86829OooO0oo, this.f86832OooOO0o.hasResult()), this.f86824OooO0OO);
                C25732OooO0O0.OooO00o();
            }
        }
        C25732OooO0O0.OooO00o();
    }

    @Override // o0ooOO.InterfaceC31496OooO00o
    public final void OooO0OO() {
        C25732OooO0O0.OooO00o();
        if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
            C25438OooO00o.OooO0o0(f86819OooOOo, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f86829OooO0oo);
        }
        this.f86822OooO00o.OooO00o(C25476OooO0OO.OooO00o.f86805OooOooO);
        this.f86821OooO = false;
        C25475OooO0O0 c25475OooO0O0 = this.f86823OooO0O0;
        c25475OooO0O0.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            synchronized (c25475OooO0O0.f86789OooO0O0) {
                try {
                    if (!c25475OooO0O0.f86791OooO0Oo.contains(this)) {
                        c25475OooO0O0.f86791OooO0Oo.add(this);
                        boolean z = c25475OooO0O0.f86791OooO0Oo.size() == 1;
                        if (z) {
                            c25475OooO0O0.f86790OooO0OO.post(c25475OooO0O0.f86792OooO0o);
                        }
                    }
                } finally {
                }
            }
        } else {
            release();
        }
        C25732OooO0O0.OooO00o();
    }

    @Override // o0ooOO.InterfaceC31496OooO00o
    public void OooO0Oo(InterfaceC31497OooO0O0 interfaceC31497OooO0O0) {
        if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
            C25438OooO00o.OooO0o(f86819OooOOo, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f86829OooO0oo, interfaceC31497OooO0O0);
        }
        this.f86822OooO00o.OooO00o(interfaceC31497OooO0O0 != null ? C25476OooO0OO.OooO00o.f86799OooOo0o : C25476OooO0OO.OooO00o.f86798OooOo);
        if (this.f86830OooOO0) {
            this.f86823OooO0O0.OooO00o(this);
            release();
        }
        InterfaceC31498OooO0OO interfaceC31498OooO0OO = this.f86826OooO0o;
        if (interfaceC31498OooO0OO != null) {
            interfaceC31498OooO0OO.OooO00o(null);
            this.f86826OooO0o = null;
        }
        if (interfaceC31497OooO0O0 != null) {
            if (!(interfaceC31497OooO0O0 instanceof InterfaceC31498OooO0OO)) {
                throw new IllegalArgumentException();
            }
            InterfaceC31498OooO0OO interfaceC31498OooO0OO2 = (InterfaceC31498OooO0OO) interfaceC31497OooO0O0;
            this.f86826OooO0o = interfaceC31498OooO0OO2;
            interfaceC31498OooO0OO2.OooO00o(this.f86828OooO0oO);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o(InterfaceC25482OooO0o0<? super INFO> interfaceC25482OooO0o0) {
        interfaceC25482OooO0o0.getClass();
        InterfaceC25482OooO0o0<INFO> interfaceC25482OooO0o02 = this.f86825OooO0Oo;
        if (interfaceC25482OooO0o02 instanceof OooO0O0) {
            ((OooO0O0) interfaceC25482OooO0o02).OooO0oO(interfaceC25482OooO0o0);
            return;
        }
        if (interfaceC25482OooO0o02 == null) {
            this.f86825OooO0Oo = interfaceC25482OooO0o0;
            return;
        }
        C25732OooO0O0.OooO00o();
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.OooO0oO(interfaceC25482OooO0o02);
        oooO0O0.OooO0oO(interfaceC25482OooO0o0);
        C25732OooO0O0.OooO00o();
        this.f86825OooO0Oo = oooO0O0;
    }

    @Override // o0ooOO.InterfaceC31496OooO00o
    public final InterfaceC31498OooO0OO OooO0o0() {
        return this.f86826OooO0o;
    }

    public abstract Drawable OooO0oO(T t);

    public T OooO0oo() {
        return null;
    }

    public abstract InterfaceC25467OooO0o0<T> OooOO0();

    public int OooOO0O(T t) {
        return System.identityHashCode(t);
    }

    public abstract OooO OooOO0o(Object obj);

    public final synchronized void OooOOO(String str) {
        C25475OooO0O0 c25475OooO0O0;
        try {
            C25732OooO0O0.OooO00o();
            this.f86822OooO00o.OooO00o(C25476OooO0OO.OooO00o.f86804OooOoo0);
            if (!this.f86833OooOOO && (c25475OooO0O0 = this.f86823OooO0O0) != null) {
                c25475OooO0O0.OooO00o(this);
            }
            this.f86821OooO = false;
            OooOo();
            InterfaceC25482OooO0o0<INFO> interfaceC25482OooO0o0 = this.f86825OooO0Oo;
            if (interfaceC25482OooO0o0 instanceof OooO0O0) {
                OooO0O0 oooO0O0 = (OooO0O0) interfaceC25482OooO0o0;
                synchronized (oooO0O0) {
                    oooO0O0.f86854OooO00o.clear();
                }
            } else {
                this.f86825OooO0Oo = null;
            }
            InterfaceC31498OooO0OO interfaceC31498OooO0OO = this.f86826OooO0o;
            if (interfaceC31498OooO0OO != null) {
                interfaceC31498OooO0OO.reset();
                this.f86826OooO0o.OooO00o(null);
                this.f86826OooO0o = null;
            }
            this.f86828OooO0oO = null;
            if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                C25438OooO00o.OooO0o(f86819OooOOo, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f86829OooO0oo, str);
            }
            this.f86829OooO0oo = str;
            C25732OooO0O0.OooO00o();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final InterfaceC31498OooO0OO OooOOO0() {
        InterfaceC31498OooO0OO interfaceC31498OooO0OO = this.f86826OooO0o;
        if (interfaceC31498OooO0OO != null) {
            return interfaceC31498OooO0OO;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: null");
    }

    public final boolean OooOOOO(String str, InterfaceC25467OooO0o0<T> interfaceC25467OooO0o0) {
        if (interfaceC25467OooO0o0 == null && this.f86832OooOO0o == null) {
            return true;
        }
        return str.equals(this.f86829OooO0oo) && interfaceC25467OooO0o0 == this.f86832OooOO0o && this.f86830OooOO0;
    }

    public final void OooOOOo(String str, Throwable th) {
        if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f86829OooO0oo;
            if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                C25439OooO0O0.OooO0O0(2, f86819OooOOo.getSimpleName(), String.format(null, "controller %x %s: %s: failure: %s", numValueOf, str2, str, th));
            }
        }
    }

    public final InterfaceC25618OooO0O0.OooO00o OooOOo(Map map, Map map2) {
        InterfaceC31498OooO0OO interfaceC31498OooO0OO = this.f86826OooO0o;
        if (interfaceC31498OooO0OO instanceof C30838OooO00o) {
            C30838OooO00o c30838OooO00o = (C30838OooO00o) interfaceC31498OooO0OO;
            String.valueOf(!(c30838OooO00o.OooOO0() instanceof C25560OooOOo0) ? null : c30838OooO00o.OooOO0O().f87233OooOoO);
            if (c30838OooO00o.OooOO0() instanceof C25560OooOOo0) {
                c30838OooO00o.OooOO0O().getClass();
            }
        }
        InterfaceC31498OooO0OO interfaceC31498OooO0OO2 = this.f86826OooO0o;
        Rect bounds = interfaceC31498OooO0OO2 != null ? interfaceC31498OooO0OO2.getBounds() : null;
        Map<String, ? extends Object> componentAttribution = f86818OooOOOo;
        OooOOO0.OooO0oO(componentAttribution, "componentAttribution");
        Map<String, ? extends Object> shortcutAttribution = f86820OooOOo0;
        OooOOO0.OooO0oO(shortcutAttribution, "shortcutAttribution");
        InterfaceC25618OooO0O0.OooO00o oooO00o = new InterfaceC25618OooO0O0.OooO00o();
        if (bounds != null) {
            bounds.width();
            bounds.height();
        }
        oooO00o.f87418OooO0OO = map;
        oooO00o.f87419OooO0Oo = map2;
        oooO00o.f87417OooO0O0 = shortcutAttribution;
        oooO00o.f87416OooO00o = componentAttribution;
        return oooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOo0(Object obj, String str) {
        if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
            Object[] objArr = {Integer.valueOf(System.identityHashCode(this)), this.f86829OooO0oo, str, obj != 0 ? obj.getClass().getSimpleName() : "<null>", Integer.valueOf(OooOO0O(obj))};
            if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                C25439OooO0O0.OooO0O0(2, f86819OooOOo.getSimpleName(), String.format(null, "controller %x %s: %s: image: %s %x", objArr));
            }
        }
    }

    public abstract Map<String, Object> OooOOoo(INFO info);

    public final void OooOo() {
        Map<String, Object> extras;
        boolean z = this.f86830OooOO0;
        this.f86830OooOO0 = false;
        this.f86831OooOO0O = false;
        InterfaceC25467OooO0o0<T> interfaceC25467OooO0o0 = this.f86832OooOO0o;
        Map<String, Object> map = null;
        if (interfaceC25467OooO0o0 != null) {
            extras = interfaceC25467OooO0o0.getExtras();
            this.f86832OooOO0o.close();
            this.f86832OooOO0o = null;
        } else {
            extras = null;
        }
        Drawable drawable = this.f86835OooOOOO;
        if (drawable != null) {
            OooOo0o(drawable);
        }
        this.f86835OooOOOO = null;
        T t = this.f86834OooOOO0;
        if (t != null) {
            Map<String, Object> mapOooOOoo = OooOOoo(OooOO0o(t));
            OooOOo0(this.f86834OooOOO0, "release");
            OooOoO0(this.f86834OooOOO0);
            this.f86834OooOOO0 = null;
            map = mapOooOOoo;
        }
        if (z) {
            OooO().OooO0O0(this.f86829OooO0oo);
            this.f86827OooO0o0.OooO0o(this.f86829OooO0oo, OooOOo(extras, map));
        }
    }

    public void OooOo0(Object obj) {
    }

    public final void OooOo00(String str, InterfaceC25467OooO0o0<T> interfaceC25467OooO0o0, Throwable th, boolean z) {
        C25732OooO0O0.OooO00o();
        if (!OooOOOO(str, interfaceC25467OooO0o0)) {
            OooOOOo("ignore_old_datasource @ onFailure", th);
            interfaceC25467OooO0o0.close();
            C25732OooO0O0.OooO00o();
            return;
        }
        this.f86822OooO00o.OooO00o(z ? C25476OooO0OO.OooO00o.f86808Oooo0 : C25476OooO0OO.OooO00o.f86812Oooo0O0);
        C25619OooO0OO<INFO> c25619OooO0OO = this.f86827OooO0o0;
        if (z) {
            OooOOOo("final_failed @ onFailure", th);
            this.f86832OooOO0o = null;
            this.f86831OooOO0O = true;
            InterfaceC31498OooO0OO interfaceC31498OooO0OO = this.f86826OooO0o;
            if (interfaceC31498OooO0OO != null) {
                interfaceC31498OooO0OO.OooO0OO();
            }
            InterfaceC25618OooO0O0.OooO00o oooO00oOooOOo = OooOOo(interfaceC25467OooO0o0 == null ? null : interfaceC25467OooO0o0.getExtras(), OooOOoo(null));
            OooO().OooO0OO(this.f86829OooO0oo, th);
            c25619OooO0OO.OooO0Oo(this.f86829OooO0oo, th, oooO00oOooOOo);
        } else {
            OooOOOo("intermediate_failed @ onFailure", th);
            OooO().OooO0o(this.f86829OooO0oo, th);
            c25619OooO0OO.OooO0OO(this.f86829OooO0oo);
        }
        C25732OooO0O0.OooO00o();
    }

    public final void OooOo0O(String str, InterfaceC25467OooO0o0<T> interfaceC25467OooO0o0, T t, float f, boolean z, boolean z2, boolean z3) {
        try {
            C25732OooO0O0.OooO00o();
            if (!OooOOOO(str, interfaceC25467OooO0o0)) {
                OooOOo0(t, "ignore_old_datasource @ onNewResult");
                OooOoO0(t);
                interfaceC25467OooO0o0.close();
                C25732OooO0O0.OooO00o();
                return;
            }
            this.f86822OooO00o.OooO00o(z ? C25476OooO0OO.OooO00o.f86810Oooo00O : C25476OooO0OO.OooO00o.f86811Oooo00o);
            try {
                Drawable drawableOooO0oO = OooO0oO(t);
                T t2 = this.f86834OooOOO0;
                Drawable drawable = this.f86835OooOOOO;
                this.f86834OooOOO0 = t;
                this.f86835OooOOOO = drawableOooO0oO;
                try {
                    if (z) {
                        OooOOo0(t, "set_final_result @ onNewResult");
                        this.f86832OooOO0o = null;
                        OooOOO0().OooO0o0(drawableOooO0oO, 1.0f, z2);
                        OooOoO(str, t, interfaceC25467OooO0o0);
                    } else if (z3) {
                        OooOOo0(t, "set_temporary_result @ onNewResult");
                        OooOOO0().OooO0o0(drawableOooO0oO, 1.0f, z2);
                        OooOoO(str, t, interfaceC25467OooO0o0);
                    } else {
                        OooOOo0(t, "set_intermediate_result @ onNewResult");
                        OooOOO0().OooO0o0(drawableOooO0oO, f, z2);
                        OooO oooOOooOO0o = OooOO0o(t);
                        OooO().OooO00o(oooOOooOO0o, str);
                        this.f86827OooO0o0.OooO00o(oooOOooOO0o, str);
                    }
                    if (drawable != null && drawable != drawableOooO0oO) {
                        OooOo0o(drawable);
                    }
                    if (t2 != null && t2 != t) {
                        OooOOo0(t2, "release_previous_result @ onNewResult");
                        OooOoO0(t2);
                    }
                    C25732OooO0O0.OooO00o();
                } catch (Throwable th) {
                    if (drawable != null && drawable != drawableOooO0oO) {
                        OooOo0o(drawable);
                    }
                    if (t2 != null && t2 != t) {
                        OooOOo0(t2, "release_previous_result @ onNewResult");
                        OooOoO0(t2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                OooOOo0(t, "drawable_failed @ onNewResult");
                OooOoO0(t);
                OooOo00(str, interfaceC25467OooO0o0, e, z);
                C25732OooO0O0.OooO00o();
            }
        } catch (Throwable th2) {
            C25732OooO0O0.OooO00o();
            throw th2;
        }
    }

    public abstract void OooOo0o(Drawable drawable);

    public final void OooOoO(String str, T t, InterfaceC25467OooO0o0<T> interfaceC25467OooO0o0) {
        OooO oooOOooOO0o = OooOO0o(t);
        InterfaceC25482OooO0o0<INFO> interfaceC25482OooO0o0OooO = OooO();
        Object obj = this.f86835OooOOOO;
        interfaceC25482OooO0o0OooO.OooO0o0(str, oooOOooOO0o, obj instanceof Animatable ? (Animatable) obj : null);
        this.f86827OooO0o0.OooO0o0(str, oooOOooOO0o, OooOOo(interfaceC25467OooO0o0 != null ? interfaceC25467OooO0o0.getExtras() : null, OooOOoo(oooOOooOO0o)));
    }

    public abstract void OooOoO0(T t);

    @Override // o00oO00O.AbstractC25474OooO00o.InterfaceC19705OooO00o
    public final void release() {
        this.f86822OooO00o.OooO00o(C25476OooO0OO.OooO00o.f86806OooOooo);
        InterfaceC31498OooO0OO interfaceC31498OooO0OO = this.f86826OooO0o;
        if (interfaceC31498OooO0OO != null) {
            interfaceC31498OooO0OO.reset();
        }
        OooOo();
    }

    public String toString() {
        C25431OooO0oo.OooO00o oooO00oOooO0O0 = C25431OooO0oo.OooO0O0(this);
        oooO00oOooO0O0.OooO0O0("isAttached", this.f86821OooO);
        oooO00oOooO0O0.OooO0O0("isRequestSubmitted", this.f86830OooOO0);
        oooO00oOooO0O0.OooO0O0("hasFetchFailed", this.f86831OooOO0O);
        oooO00oOooO0O0.OooO00o("fetchedImage", OooOO0O(this.f86834OooOOO0));
        oooO00oOooO0O0.OooO0OO(this.f86822OooO00o.f86797OooO00o.toString(), "events");
        return oooO00oOooO0O0.toString();
    }
}
