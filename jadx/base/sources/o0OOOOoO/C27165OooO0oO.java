package o0OOOOoO;

import OooO0o.C20424OooO0Oo;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0Oo00o.C28028OooO0o;
import o0oo0OOo.C31236OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0OOOOoO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27165OooO0oO implements InterfaceC33721OooO0o<Map<Integer, ? extends Object>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DisplayMetrics f94824OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f94825OooOo0o;

    /* JADX INFO: renamed from: o0OOOOoO.OooO0oO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ DisplayMetrics f94826OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f94827OooOo0o;

        /* JADX INFO: renamed from: o0OOOOoO.OooO0oO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.textboxinfo.TextBoxInfoLocalDataSource$getTextStyle$$inlined$map$1$2", m80623f = "TextBoxInfoLocalDataSource.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19857OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f94828OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f94829OooOo0o;

            public C19857OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f94829OooOo0o = obj;
                this.f94828OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, DisplayMetrics displayMetrics) {
            this.f94827OooOo0o = interfaceC33723OooO0oO;
            this.f94826OooOo = displayMetrics;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r10v26, types: [oO0o0Oo.OooO0oO] */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.util.LinkedHashMap, java.util.Map] */
        /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19857OooO00o c19857OooO00o;
            ?? OooOOOO2;
            if (continuation instanceof C19857OooO00o) {
                c19857OooO00o = (C19857OooO00o) continuation;
                int i = c19857OooO00o.f94828OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19857OooO00o.f94828OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19857OooO00o = new C19857OooO00o(continuation);
                }
            }
            Object obj2 = c19857OooO00o.f94829OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19857OooO00o.f94828OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(OooOOO.f94840OooO0o0);
                if (str == null) {
                    OooOOOO2 = C31236OooO00o.f111404OooO00o;
                } else {
                    Object objFromJson = C28028OooO0o.OooO00o().fromJson(str, new C27166OooO0oo().getType());
                    kotlin.jvm.internal.OooOOO0.OooO0o(objFromJson, "fromJson(...)");
                    OooOOOO2 = C34444Oooo0O0.OooOOOO((Map) objFromJson);
                    if (OooOOOO2.containsKey(new Integer(12))) {
                        Object objOooO0Oo = C20424OooO0Oo.OooO0Oo(12, OooOOOO2);
                        Double d = objOooO0Oo instanceof Double ? (Double) objOooO0Oo : null;
                        if (d != null) {
                            OooOOOO2.put(new Integer(12), new Integer(oO0O00O.OooO00o.OooO00o(d.doubleValue())));
                        }
                    }
                    if (OooOOOO2.containsKey(new Integer(11))) {
                        Object objOooO0Oo2 = C20424OooO0Oo.OooO0Oo(11, OooOOOO2);
                        Double d2 = objOooO0Oo2 instanceof Double ? (Double) objOooO0Oo2 : null;
                        if (d2 != null) {
                            OooOOOO2.put(new Integer(13), new Integer(oO0O00O.OooO00o.OooO0O0(TypedValue.applyDimension(2, (float) d2.doubleValue(), this.f94826OooOo))));
                        }
                    }
                    if (OooOOOO2.containsKey(new Integer(13))) {
                        Object objOooO0Oo3 = C20424OooO0Oo.OooO0Oo(13, OooOOOO2);
                        Double d3 = objOooO0Oo3 instanceof Double ? (Double) objOooO0Oo3 : null;
                        if (d3 != null) {
                            OooOOOO2.put(new Integer(13), new Integer(oO0O00O.OooO00o.OooO00o(d3.doubleValue())));
                        }
                    }
                }
                c19857OooO00o.f94828OooOo = 1;
                if (this.f94827OooOo0o.emit(OooOOOO2, c19857OooO00o) == enumC32485OooO00o) {
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

    public C27165OooO0oO(InterfaceC33721OooO0o interfaceC33721OooO0o, DisplayMetrics displayMetrics) {
        this.f94825OooOo0o = interfaceC33721OooO0o;
        this.f94824OooOo = displayMetrics;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Map<Integer, ? extends Object>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f94825OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f94824OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
