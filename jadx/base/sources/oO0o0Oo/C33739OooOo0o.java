package oO0o0Oo;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: oO0o0Oo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33739OooOo0o<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<Throwable> f121615OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO<T> f121616OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.OooOo0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m80623f = "Errors.kt", m80624l = {154}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f121617OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C33739OooOo0o f121618OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f121619OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C33739OooOo0o<T> f121620OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(C33739OooOo0o<? super T> c33739OooOo0o, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f121620OooOoO0 = c33739OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121617OooOo = obj;
            this.f121619OooOoO |= Integer.MIN_VALUE;
            return this.f121620OooOoO0.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33739OooOo0o(InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, C24034Oooo00O<Throwable> c24034Oooo00O) {
        this.f121616OooOo0o = interfaceC33723OooO0oO;
        this.f121615OooOo = c24034Oooo00O;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        OooO00o oooO00o;
        C33739OooOo0o<T> c33739OooOo0o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121619OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121619OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        }
        Object obj = oooO00o.f121617OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121619OooOoO;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33739OooOo0o = oooO00o.f121618OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable 
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*
                this = this;
                boolean r0 = r6 instanceof oO0o0Oo.C33739OooOo0o.OooO00o
                if (r0 == 0) goto L13
                r0 = r6
                oO0o0Oo.OooOo0o$OooO00o r0 = (oO0o0Oo.C33739OooOo0o.OooO00o) r0
                int r1 = r0.f121619OooOoO
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f121619OooOoO = r1
                goto L18
            L13:
                oO0o0Oo.OooOo0o$OooO00o r0 = new oO0o0Oo.OooOo0o$OooO00o
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f121617OooOo
                oO00ooo0.OooO00o r1 = oO00ooo0.EnumC32485OooO00o.f116726OooOo0o
                int r2 = r0.f121619OooOoO
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                oO0o0Oo.OooOo0o r5 = r0.f121618OooOo0o
                oO00ooO.C32446OooOOOo.OooO0O0(r6)     // Catch: java.lang.Throwable -> L29
                goto L43
            L29:
                r6 = move-exception
                goto L48
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                oO00ooO.C32446OooOOOo.OooO0O0(r6)
                oO0o0Oo.OooO0oO<T> r6 = r4.f121616OooOo0o     // Catch: java.lang.Throwable -> L46
                r0.f121618OooOo0o = r4     // Catch: java.lang.Throwable -> L46
                r0.f121619OooOoO = r3     // Catch: java.lang.Throwable -> L46
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L46
                if (r5 != r1) goto L43
                return r1
            L43:
                oO00ooO.OooOooO r5 = oO00ooO.C32460OooOooO.f116667OooO00o
                return r5
            L46:
                r6 = move-exception
                r5 = r4
            L48:
                kotlin.jvm.internal.Oooo00O<java.lang.Throwable> r5 = r5.f121615OooOo
                r5.f80942OooOo0o = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: oO0o0Oo.C33739OooOo0o.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }
