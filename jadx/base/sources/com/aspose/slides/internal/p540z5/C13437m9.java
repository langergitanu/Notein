package com.aspose.slides.internal.p540z5;

import com.aspose.slides.internal.p185il.C5103kk;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6906k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p540z5.AbstractC13439x1;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.z5.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C13437m9 extends AbstractC13439x1 {

    /* JADX INFO: renamed from: k4 */
    private k4 f44966k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC13439x1.m9 f44967x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.m9$k4 */
    public static class k4 implements InterfaceC6906k4 {

        /* JADX INFO: renamed from: k4 */
        private final x1 f44968k4;

        /* JADX INFO: renamed from: kk */
        private int f44969kk;

        /* JADX INFO: renamed from: to */
        private int f44970to;

        /* JADX INFO: renamed from: x1 */
        private final int f44971x1;

        public k4(x1 x1Var, int i, int i2) {
            this.f44968k4 = x1Var;
            this.f44971x1 = i2;
            this.f44969kk = i;
            this.f44970to = i2;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6906k4
        /* JADX INFO: renamed from: k4 */
        public void mo27037k4() {
            mo27038k4(this.f44971x1);
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6906k4
        /* JADX INFO: renamed from: k4 */
        public void mo27038k4(int i) {
            int i2 = this.f44970to - i;
            this.f44970to = i2;
            if (i2 == 0) {
                int iM67507x1 = C14116yg.m67507x1(this.f44971x1, this.f44969kk);
                this.f44968k4.m62529k4(iM67507x1);
                int i3 = this.f44969kk - iM67507x1;
                this.f44969kk = i3;
                if (i3 > 0) {
                    this.f44970to = C14116yg.m67507x1(this.f44971x1, i3);
                    this.f44968k4.m62528k4();
                }
            }
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6910x1
        /* JADX INFO: renamed from: k4 */
        public void mo27041k4(byte[] bArr, int i) {
            this.f44968k4.m62530k4(bArr, i);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.m9$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: du */
        private int f44972du;

        /* JADX INFO: renamed from: k4 */
        private final InterfaceC6906k4 f44973k4;

        /* JADX INFO: renamed from: kk */
        private final int f44974kk;

        /* JADX INFO: renamed from: to */
        private byte[] f44975to;

        /* JADX INFO: renamed from: x1 */
        private final int f44976x1;

        /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
            java.lang.IllegalArgumentException: Illegal Capacity: -1
            	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
            	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
            	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        public x1(
        /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
            java.lang.IllegalArgumentException: Illegal Capacity: -1
            	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
            	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
            	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */

        /* JADX INFO: renamed from: k4 */
        private static int m62527k4(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            int i4 = i2 + i;
            int i5 = i4 - 1;
            int i6 = i4 - 2;
            while (i <= i5) {
                byte b = bArr[i];
                int i7 = 1;
                while (i7 < 127 && i < i5) {
                    int i8 = i + 1;
                    if ((bArr[i] & 255) != (bArr[i8] & 255)) {
                        break;
                    }
                    i7++;
                    i = i8;
                }
                if (i7 > 1) {
                    i++;
                    int i9 = i3 + 1;
                    bArr2[i3] = (byte) ((-(i7 - 1)) & 255);
                    i3 += 2;
                    bArr2[i9] = b;
                }
                int i10 = i3;
                int i11 = 0;
                while (i11 < 128 && ((i < i5 && (bArr[i] & 255) != (bArr[i + 1] & 255)) || (i < i6 && (bArr[i] & 255) != (bArr[i + 2] & 255)))) {
                    i11++;
                    i10++;
                    bArr2[i10] = bArr[i];
                    i++;
                }
                if (i11 > 0) {
                    bArr2[i3] = (byte) ((i11 - 1) & 255);
                    i10++;
                }
                if (i == i5) {
                    if (i11 <= 0 || i11 >= 128) {
                        int i12 = i10 + 1;
                        bArr2[i10] = 0;
                        i10 += 2;
                        bArr2[i12] = bArr[i];
                        i++;
                    } else {
                        bArr2[i3] = (byte) (bArr2[i3] + 1);
                        i3 = i10 + 1;
                        bArr2[i10] = bArr[i];
                        i++;
                    }
                }
                i3 = i10;
            }
            return i3;
        }

        /* JADX INFO: renamed from: k4 */
        public void m62528k4() {
            this.f44975to = new byte[this.f44974kk];
            this.f44972du = 0;
        }

        /* JADX INFO: renamed from: k4 */
        public void m62529k4(int i) {
            this.f44973k4.mo27041k4(this.f44975to, this.f44972du);
            this.f44973k4.mo27038k4(i);
        }

        /* JADX INFO: renamed from: k4 */
        public void m62530k4(byte[] bArr, int i) {
            int i2;
            int i3 = 0;
            do {
                this.f44972du = m62527k4(bArr, i3, this.f44976x1, this.f44975to, this.f44972du);
                i2 = this.f44976x1;
                i3 += i2;
                i -= i2;
            } while (i >= i2);
            if (i != 0) {
                throw new C5103kk("The strip has corrupt data and cannot be decoded.");
            }
        }
    }

    public C13437m9(C6740x1 c6740x1, int i, int i2) {
        super(c6740x1, i, i2);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10036kk
    /* JADX INFO: renamed from: k4 */
    public void mo49347k4(int[] iArr, C12014ne c12014ne, InterfaceC6906k4 interfaceC6906k4) {
        if (this.f44967x1 == null) {
            int iM49324du = m49324du();
            this.f44967x1 = AbstractC13439x1.m62537k4(m49327kk(), m49325k4(), m49329x1(), iM49324du);
            x1 x1Var = new x1(interfaceC6906k4, iM49324du, m49327kk().m26556ar(), m49325k4());
            x1Var.m62528k4();
            this.f44966k4 = new k4(x1Var, m49329x1(), iM49324du);
        }
        this.f44967x1.m62541k4(iArr, this.f44966k4);
    }
}
