package o000o00O;

import OooOo.Oooo0;
import Oooo0oO.C21111o0ooOoO;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.C21996Oooo0OO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC21998Oooo0o0;
import androidx.lifecycle.o00Oo0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o000o00O.AbstractC24558OooO00o;
import o000o00o.C24561OooO0O0;

/* JADX INFO: renamed from: o000o00O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24559OooO0O0 extends AbstractC24558OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f83137OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f83138OooO0O0;

    /* JADX INFO: renamed from: o000o00O.OooO0O0$OooO00o */
    public static class OooO00o<D> extends C21996Oooo0OO<D> implements C24561OooO0O0.InterfaceC19634OooO0O0<D> {

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final C24561OooO0O0<D> f83139OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public C19632OooO0O0<D> f83140OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Object f83141OooOOO0;

        public OooO00o(C24561OooO0O0 c24561OooO0O0) {
            this.f83139OooOO0o = c24561OooO0O0;
            c24561OooO0O0.registerListener(0, this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.Oooo0
        public final void OooO(InterfaceC21998Oooo0o0<? super D> interfaceC21998Oooo0o0) {
            super.OooO(interfaceC21998Oooo0o0);
            this.f83141OooOOO0 = null;
            this.f83140OooOOO = null;
        }

        @Override // androidx.lifecycle.Oooo0
        public final void OooO0o() {
            this.f83139OooOO0o.startLoading();
        }

        @Override // androidx.lifecycle.Oooo0
        public final void OooO0oO() {
            this.f83139OooOO0o.stopLoading();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.OooOoo, java.lang.Object] */
        public final void OooOO0O() {
            ?? r0 = this.f83141OooOOO0;
            C19632OooO0O0<D> c19632OooO0O0 = this.f83140OooOOO;
            if (r0 == 0 || c19632OooO0O0 == null) {
                return;
            }
            super.OooO(c19632OooO0O0);
            OooO0Oo(r0, c19632OooO0O0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            Class<?> cls = this.f83139OooOO0o.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o000o00O.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C19632OooO0O0<D> implements InterfaceC21998Oooo0o0<D> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AbstractC24558OooO00o.InterfaceC19631OooO00o<D> f83142OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C24561OooO0O0<D> f83143OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f83144OooOoO0 = false;

        public C19632OooO0O0(C24561OooO0O0<D> c24561OooO0O0, AbstractC24558OooO00o.InterfaceC19631OooO00o<D> interfaceC19631OooO00o) {
            this.f83143OooOo0o = c24561OooO0O0;
            this.f83142OooOo = interfaceC19631OooO00o;
        }

        @Override // androidx.lifecycle.InterfaceC21998Oooo0o0
        public final void OooO0O0(D d) {
            this.f83144OooOoO0 = true;
            this.f83142OooOo.onLoadFinished(this.f83143OooOo0o, d);
        }

        public final String toString() {
            return this.f83142OooOo.toString();
        }
    }

    /* JADX INFO: renamed from: o000o00O.OooO0O0$OooO0OO */
    public static class OooO0OO extends AbstractC22019Ooooooo {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final OooO00o f83145OooO0o = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Oooo0<OooO00o> f83146OooO0Oo = new Oooo0<>();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f83147OooO0o0 = false;

        /* JADX INFO: renamed from: o000o00O.OooO0O0$OooO0OO$OooO00o */
        public static class OooO00o implements o00Oo0.OooO0O0 {
            @Override // androidx.lifecycle.o00Oo0.OooO0O0
            public final <T extends AbstractC22019Ooooooo> T OooO00o(Class<T> cls) {
                return new OooO0OO();
            }
        }

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
        /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v6 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        @Override // androidx.lifecycle.AbstractC22019Ooooooo
        public final void OooO0OO() {
            /*
                r9 = this;
                OooOo.Oooo0<o000o00O.OooO0O0$OooO00o> r0 = r9.f83146OooO0Oo
                int r1 = r0.OooO0o()
                r2 = 0
                r3 = r2
            L8:
                if (r3 >= r1) goto L37
                java.lang.Object r4 = r0.OooO0oO(r3)
                o000o00O.OooO0O0$OooO00o r4 = (o000o00O.C24559OooO0O0.OooO00o) r4
                o000o00o.OooO0O0<D> r5 = r4.f83139OooOO0o
                r5.cancelLoad()
                r5.abandon()
                o000o00O.OooO0O0$OooO0O0<D> r6 = r4.f83140OooOOO
                if (r6 == 0) goto L2a
                r4.OooO(r6)
                boolean r7 = r6.f83144OooOoO0
                if (r7 == 0) goto L2a
                o000o00O.OooO00o$OooO00o<D> r7 = r6.f83142OooOo
                o000o00o.OooO0O0<D> r8 = r6.f83143OooOo0o
                r7.onLoaderReset(r8)
            L2a:
                r5.unregisterListener(r4)
                if (r6 == 0) goto L31
                boolean r4 = r6.f83144OooOoO0
            L31:
                r5.reset()
                int r3 = r3 + 1
                goto L8
            L37:
                int r1 = r0.f58539OooOoO
                java.lang.Object[] r3 = r0.f58540OooOoO0
                r4 = r2
            L3c:
                if (r4 >= r1) goto L44
                r5 = 0
                r3[r4] = r5
                int r4 = r4 + 1
                goto L3c
            L44:
                r0.f58539OooOoO = r2
                r0.f58538OooOo0o = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o000o00O.C24559OooO0O0.OooO0OO.OooO0OO():void");
        }
    }

    public C24559OooO0O0(InterfaceC21987OooOoo interfaceC21987OooOoo, C22021o00o0O c22021o00o0O) {
        this.f83137OooO00o = interfaceC21987OooOoo;
        this.f83138OooO0O0 = (OooO0OO) new o00Oo0(c22021o00o0O, OooO0OO.f83145OooO0o).OooO00o(OooO0OO.class);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Deprecated
    public final void OooO0O0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        OooO0OO oooO0OO = this.f83138OooO0O0;
        if (oooO0OO.f83146OooO0Oo.OooO0o() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < oooO0OO.f83146OooO0Oo.OooO0o(); i++) {
                OooO00o oooO00oOooO0oO = oooO0OO.f83146OooO0Oo.OooO0oO(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(oooO0OO.f83146OooO0Oo.OooO0Oo(i));
                printWriter.print(": ");
                printWriter.println(oooO00oOooO0oO.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(oooO00oOooO0oO.f83139OooOO0o);
                oooO00oOooO0oO.f83139OooOO0o.dump(C21111o0ooOoO.OooO0Oo(str2, "  "), fileDescriptor, printWriter, strArr);
                if (oooO00oOooO0oO.f83140OooOOO != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(oooO00oOooO0oO.f83140OooOOO);
                    C19632OooO0O0<D> c19632OooO0O0 = oooO00oOooO0oO.f83140OooOOO;
                    c19632OooO0O0.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(c19632OooO0O0.f83144OooOoO0);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                C24561OooO0O0<D> c24561OooO0O0 = oooO00oOooO0oO.f83139OooOO0o;
                Object obj = oooO00oOooO0oO.f65579OooO0o0;
                printWriter.println(c24561OooO0O0.dataToString(obj != androidx.lifecycle.Oooo0.f65572OooOO0O ? obj : null));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(oooO00oOooO0oO.f65576OooO0OO > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.f83137OooO00o.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
