package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p407st.C10409du;
import com.aspose.slides.internal.p407st.C10445fz;
import com.aspose.slides.internal.p407st.C10486iy;
import com.aspose.slides.internal.p407st.C10493je;
import com.aspose.slides.internal.p407st.C10562nk;

/* JADX INFO: loaded from: classes3.dex */
class u8b {
    /* JADX INFO: renamed from: k4 */
    public static void m71518k4(com.aspose.slides.internal.p332p7.s0t s0tVar, C10409du c10409du, gi8 gi8Var) {
        if (s0tVar == null) {
            return;
        }
        if (c10409du == null) {
            throw new InvalidOperationException();
        }
        C10493je c10493je = new C10493je();
        c10409du.m50513yj().addItem(c10493je);
        m71519k4(s0tVar, c10493je);
        C10486iy c10486iy = new C10486iy();
        c10493je.m50513yj().addItem(c10486iy);
        ubb.m71612k4(s0tVar.m40701du(), c10486iy, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71519k4(com.aspose.slides.internal.p332p7.s0t s0tVar, C10493je c10493je) {
        if (s0tVar == null) {
            throw new ArgumentNullException();
        }
        if (c10493je == null) {
            throw new ArgumentNullException();
        }
        C10445fz c10445fz = new C10445fz();
        c10493je.m50513yj().addItem(c10445fz);
        if (s0tVar.m40703h4() != null) {
            c10445fz.m50813k4(true);
            c10445fz.m50812k4(s0tVar.m40703h4().m42312k4());
            c10445fz.m50822x1(s0tVar.m40703h4().m42314x1());
        } else {
            c10445fz.m50813k4(false);
        }
        if (s0tVar.m40707m9() != null) {
            c10445fz.m50823x1(true);
            c10445fz.m50815kk(s0tVar.m40707m9().m42312k4());
            c10445fz.m50819to(s0tVar.m40707m9().m42314x1());
        } else {
            c10445fz.m50823x1(false);
        }
        if (s0tVar.m40702dy() != null) {
            c10445fz.m50816kk(true);
            c10445fz.m50805du(s0tVar.m40702dy().m42312k4());
            c10445fz.m50809h4(s0tVar.m40702dy().m42314x1());
        } else {
            c10445fz.m50816kk(false);
        }
        if (s0tVar.m40708to() == -1) {
            c10445fz.m50820to(false);
        } else {
            c10445fz.m50820to(true);
            c10445fz.m50811k4((byte) (s0tVar.m40708to() == 1 ? 1 : 0));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71520k4(com.aspose.slides.internal.p332p7.s0t s0tVar, C10562nk c10562nk, m4c m4cVar) {
        if (c10562nk == null || c10562nk.m51372ix() == null) {
            throw new InvalidOperationException();
        }
        C10493je c10493jeM51372ix = c10562nk.m51372ix();
        l1y.m64245k4(s0tVar.m40701du(), c10562nk, c10493jeM51372ix.m51003to(), m4cVar);
        if (c10493jeM51372ix.m51004x1().m50802c5()) {
            com.aspose.slides.internal.p332p7.uc0 uc0VarM40704k4 = s0tVar.m40704k4();
            uc0VarM40704k4.m42313k4(c10493jeM51372ix.m51004x1().m50821x1());
            uc0VarM40704k4.m42315x1(c10493jeM51372ix.m51004x1().m50814kk());
        }
        if (c10493jeM51372ix.m51004x1().m50810jd()) {
            com.aspose.slides.internal.p332p7.uc0 uc0VarM40709x1 = s0tVar.m40709x1();
            uc0VarM40709x1.m42313k4(c10493jeM51372ix.m51004x1().m50818to());
            uc0VarM40709x1.m42315x1(c10493jeM51372ix.m51004x1().m50804du());
        }
        if (c10493jeM51372ix.m51004x1().m50803ck()) {
            com.aspose.slides.internal.p332p7.uc0 uc0VarM40706kk = s0tVar.m40706kk();
            uc0VarM40706kk.m42313k4(c10493jeM51372ix.m51004x1().m50808h4());
            uc0VarM40706kk.m42315x1(c10493jeM51372ix.m51004x1().m50817m9());
        }
        if (c10493jeM51372ix.m51004x1().m50807fa()) {
            s0tVar.m40705k4((c10493jeM51372ix.m51004x1().m50806dy() & 255) != 1 ? (byte) 0 : (byte) 1);
        } else {
            s0tVar.m40705k4((byte) -1);
        }
    }
}
