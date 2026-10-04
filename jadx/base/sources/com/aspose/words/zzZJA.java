package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJA {
    private int zzYss;
    private Inline zzYst;
    private zzZAO zzYsu;
    private boolean zzYt6;

    public zzZJA(zzZAO zzzao, boolean z) {
        this.zzYsu = zzzao;
        this.zzYt6 = z;
    }

    private static Inline zzR(Inline inline) {
        Inline inline2 = (Inline) com.aspose.words.internal.zzZKW.zzZ(inline.getNextSibling(), Inline.class);
        Inline inline3 = inline;
        while (true) {
            if ((!(inline2 instanceof Run) && !(inline2 instanceof SpecialChar)) || inline2.getFont().getBidi() != inline.getFont().getBidi() || !inline2.getFont().getBorder().equals(inline.getFont().getBorder())) {
                break;
            }
            inline3 = inline2;
            inline2 = (Inline) com.aspose.words.internal.zzZKW.zzZ(inline2.getNextSibling(), Inline.class);
        }
        return inline3;
    }

    private zzLU zzZ(Inline inline, Inline inline2) {
        double size = inline.getFont().getSize();
        Iterator<Node> it = new zzYWB(inline, inline2).iterator();
        boolean z = true;
        while (it.hasNext()) {
            Inline inline3 = (Inline) com.aspose.words.internal.zzZKW.zzZ(it.next(), Inline.class);
            if (inline3 != null) {
                z = z && inline3.getFont().zzZ7k().equals(inline.getFont().zzZ7k()) && inline3.getFont().getShading().equals(inline.getFont().getShading());
                size = Math.max(inline3.getFont().getSize(), size);
            }
        }
        if (z) {
            this.zzYss |= 2;
        }
        zzLU zzlu = new zzLU();
        zzQS.zzZ(inline.getFont().getBorder(), zzlu, this.zzYt6);
        if (z) {
            if (inline.getFont().zzZ7k().isEmpty()) {
                zzM9.zzZ(inline.getFont().getShading(), zzlu);
            } else {
                zzlu.zzY("background-color", inline.getFont().zzZ7k());
            }
        }
        zzlu.zzZ("font-size", size, 4);
        return zzlu;
    }

    private void zzZ3L() {
        this.zzYsu.zzZ3E().endElement("span");
        this.zzYss = 0;
        this.zzYst = null;
    }

    public final void zzS(Inline inline) {
        if (this.zzYst == inline) {
            zzZ3L();
        }
    }

    public final int zzT(Inline inline) {
        Inline inlineZzR;
        Inline inline2 = this.zzYst;
        if (inline2 == null) {
            if (inline.getFont().getBorder().isVisible() && (inlineZzR = zzR(inline)) != inline) {
                this.zzYss = 1;
                this.zzYst = inlineZzR;
                this.zzYsu.zzZ3E().zzZN("span", 0);
                this.zzYsu.zzZ3C().zzV(zzZ(inline, inlineZzR));
            }
        } else if (Node.zzD(inline2, inline)) {
            zzZ3L();
        }
        return this.zzYss;
    }

    public final void zzZ3M() {
        if (this.zzYst != null) {
            zzZ3L();
        }
    }
}
