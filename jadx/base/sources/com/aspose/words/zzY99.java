package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY99 {
    private com.aspose.words.internal.zzZQC<zzZ> zzXaL = new com.aspose.words.internal.zzZQC<>();
    private IWarningCallback zzZG0;
    private int zzu;

    public static class zzY {
        private zzYJC zzXBq;
        private boolean zzXaG;

        public zzY(zzYJC zzyjc) {
            this(zzyjc, false);
        }

        public final boolean zzY46() {
            return this.zzXaG;
        }

        public final zzYJC zzY47() {
            return this.zzXBq;
        }

        public zzY(zzYJC zzyjc, boolean z) {
            this.zzXBq = zzyjc;
            this.zzXaG = z;
        }
    }

    public zzY99(IWarningCallback iWarningCallback, int i) {
        this.zzZG0 = iWarningCallback;
        this.zzu = i;
    }

    private static boolean zzWs(Node node) {
        return node.getAncestor(35) != null;
    }

    public final void zzV(zzZV8 zzzv8) {
        if (this.zzXaL.size() == 0) {
            zzY4h();
        }
        zzZ zzzPeek = this.zzXaL.peek();
        if (zzzv8.getType() == 1) {
            zzzPeek.zzT(zzzv8);
        } else {
            zzzPeek.zzU(zzzv8);
        }
    }

    public final zzYJC zzX(zzYJC zzyjc) {
        this.zzXaL.size();
        if (this.zzXaL.size() == 0) {
            return null;
        }
        zzZ zzzPeek = this.zzXaL.peek();
        zzYX5 zzyx5 = (zzYX5) com.aspose.words.internal.zzZKW.zzZ(zzyjc, zzYX5.class);
        zzZV8 zzzv8 = (zzZV8) com.aspose.words.internal.zzZKW.zzZ(zzyjc, zzZV8.class);
        if (zzyx5 != null) {
            return zzZ(zzyx5, zzzPeek);
        }
        if (zzzv8 != null) {
            return zzzv8.getType() == 1 ? zzzPeek.zzY4d().zzY47() : zzzPeek.zzY4f().zzY47();
        }
        return null;
    }

    public final void zzY4g() {
        this.zzXaL.pop();
    }

    public final void zzY4h() {
        this.zzXaL.push(new zzZ((byte) 0));
    }

    public final void zzZ(zzYEF zzyef, Node node) {
        if (this.zzXaL.size() == 0) {
            return;
        }
        zzZ zzzPeek = this.zzXaL.peek();
        zzY zzyZzY4c = zzzPeek.zzY4c();
        if (zzyZzY4c != null) {
            zzyef.zzQ(12, (zzZV8) zzyZzY4c.zzY47());
        }
        zzY zzyZzY4e = zzzPeek.zzY4e();
        if (zzyZzY4e != null) {
            zzyef.zzQ(14, (zzZV8) zzyZzY4e.zzY47());
        }
        zzY zzyZzY48 = zzzPeek.zzY48();
        if (zzyZzY48 != null && (!zzyZzY48.zzY46() || zzWs(node))) {
            zzyef.zzQ(13, (zzYX5) zzyZzY48.zzY47());
        }
        zzY zzyZzY4a = zzzPeek.zzY4a();
        if (zzyZzY4a != null) {
            if (!zzyZzY4a.zzY46() || zzWs(node)) {
                zzyef.zzQ(15, (zzYX5) zzyZzY4a.zzY47());
            }
        }
    }

    public static class zzZ {
        private com.aspose.words.internal.zzZQC<zzY> zzXaH;
        private com.aspose.words.internal.zzZQC<zzY> zzXaI;
        private com.aspose.words.internal.zzZQC<zzY> zzXaJ;
        private com.aspose.words.internal.zzZQC<zzY> zzXaK;

        private zzZ() {
            this.zzXaK = new com.aspose.words.internal.zzZQC<>();
            this.zzXaJ = new com.aspose.words.internal.zzZQC<>();
            this.zzXaI = new com.aspose.words.internal.zzZQC<>();
            this.zzXaH = new com.aspose.words.internal.zzZQC<>();
        }

        public final void zzT(zzZV8 zzzv8) {
            this.zzXaJ.push(new zzY(zzzv8));
        }

        public final void zzU(zzZV8 zzzv8) {
            this.zzXaK.push(new zzY(zzzv8));
        }

        public final void zzX(zzYX5 zzyx5, boolean z) {
            this.zzXaH.push(new zzY(zzyx5, z));
        }

        public final void zzY(zzYX5 zzyx5, boolean z) {
            this.zzXaI.push(new zzY(zzyx5, z));
        }

        public final zzY zzY48() {
            if (this.zzXaH.size() == 0) {
                return null;
            }
            return this.zzXaH.peek();
        }

        public final zzY zzY49() {
            if (this.zzXaH.size() == 0) {
                return null;
            }
            return this.zzXaH.pop();
        }

        public final zzY zzY4a() {
            if (this.zzXaI.size() == 0) {
                return null;
            }
            return this.zzXaI.peek();
        }

        public final zzY zzY4b() {
            if (this.zzXaI.size() == 0) {
                return null;
            }
            return this.zzXaI.pop();
        }

        public final zzY zzY4c() {
            if (this.zzXaJ.size() == 0) {
                return null;
            }
            return this.zzXaJ.peek();
        }

        public final zzY zzY4d() {
            return this.zzXaJ.pop();
        }

        public final zzY zzY4e() {
            if (this.zzXaK.size() == 0) {
                return null;
            }
            return this.zzXaK.peek();
        }

        public final zzY zzY4f() {
            return this.zzXaK.pop();
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public final void zzZ(zzYX5 zzyx5, boolean z) {
        if (this.zzXaL.size() == 0) {
            zzY4h();
        }
        zzZ zzzPeek = this.zzXaL.peek();
        if (zzyx5.getType() == 0) {
            zzzPeek.zzX(zzyx5, z);
        } else {
            zzzPeek.zzY(zzyx5, z);
        }
    }

    private zzYJC zzZ(zzYX5 zzyx5, zzZ zzz) {
        zzY zzyZzY4b;
        if (zzyx5.getType() == 0) {
            zzyZzY4b = zzz.zzY49();
        } else {
            zzyZzY4b = zzz.zzY4b();
        }
        zzYX5 zzyx52 = (zzYX5) (zzyZzY4b != null ? zzyZzY4b.zzY47() : null);
        if (zzyx52 == null && this.zzZG0 != null) {
            this.zzZG0.warning(new WarningInfo(16777216, this.zzu, "The start element of moved content is missed. End element will be ignored."));
        }
        return zzyx52;
    }
}
