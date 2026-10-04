package com.aspose.slides.internal.p279mr;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p299ni.InterfaceC6904h4;
import com.aspose.slides.internal.p299ni.InterfaceC6909to;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C6437jd {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC6416c5 m26317k4(int i, int i2, int i3, InterfaceC6901du interfaceC6901du, C13609qq c13609qq, C12014ne c12014ne, InterfaceC6901du interfaceC6901du2, C13609qq c13609qq2, int i4, int i5, InterfaceC6904h4 interfaceC6904h4, InterfaceC6909to interfaceC6909to, int i6) {
        int i7;
        int iM62788to = c13609qq.m62788to();
        int iM62788to2 = c13609qq2.m62788to();
        if (i5 == 2 && interfaceC6909to != null) {
            return new C6419ck(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6909to);
        }
        if (c13609qq.m62787kk() == c13609qq2.m62787kk() && m26319k4(interfaceC6901du, interfaceC6901du2, i5, iM62788to, iM62788to2)) {
            return new C6426fa(i, i2, i3, c12014ne.Clone(), i4, c13609qq);
        }
        if (c13609qq.m62787kk() == 0) {
            if (c13609qq2.m62787kk() == 4) {
                return new C6465u4(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 0 && c13609qq2.m62788to() == 16) {
                return new C6468uz(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 3 && c13609qq.m62788to() == 8) {
                return new C6466um(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62788to() == 24 && c13609qq2.m62787kk() == 1 && c13609qq.m62788to() == 8) {
                return new C6473wl(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62788to() == 32 && c13609qq2.m62787kk() == 1 && c13609qq.m62788to() == 8) {
                return new C6453qq(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 2 && c13609qq2.m62788to() == 32 && c13609qq.m62788to() == 8) {
                return new C6411ar(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq.m62788to() != 16) {
                throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
            }
            if (c13609qq2.m62787kk() == 3) {
                return new C6434ix(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62788to() == 24 && c13609qq2.m62787kk() == 1) {
                return new C6486yj(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62788to() == 32 && c13609qq2.m62787kk() == 1) {
                return new C6456rv(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62788to() == 16 && c13609qq2.m62787kk() == 1) {
                return new C6467up(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 2 && c13609qq2.m62788to() == 32) {
                return new C6442ks(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 2 && c13609qq2.m62788to() == 24) {
                return new C6449ne(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62788to() == 8) {
                return new C6479x6(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
        }
        if (c13609qq.m62787kk() == 3) {
            if (c13609qq2.m62788to() == 24 && c13609qq2.m62787kk() == 2) {
                return new C6476wz(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62788to() == 32 && c13609qq2.m62787kk() == 2) {
                return new C6487yn(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62788to() == 24 && c13609qq2.m62787kk() == 1) {
                return new C6448na(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62788to() == 16 && c13609qq2.m62787kk() == 1) {
                return new C6488yo(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62788to() == 32 && c13609qq2.m62787kk() == 1) {
                return new C6464u1(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 4) {
                return new C6485yg(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 0 && c13609qq2.m62788to() == 8) {
                return new C6430gk(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 0 && c13609qq2.m62788to() == 16) {
                return new C6433ig(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62788to() == 8) {
                return new C6478x5(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6901du2, i6);
            }
            throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
        }
        if (c13609qq.m62787kk() == 4) {
            if (c13609qq2.m62787kk() == 1 && c13609qq2.m62788to() == 24) {
                return new C6421du(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 1 && c13609qq2.m62788to() == 16) {
                return new C6461to(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 1 && c13609qq2.m62788to() == 32) {
                return new C6446m9(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 2 && c13609qq2.m62788to() == 32) {
                return new C6422dy(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 2 && c13609qq2.m62788to() == 24) {
                return new C6431h4(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 0 && c13609qq2.m62788to() == 16) {
                return new C6477x1(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 0 && c13609qq2.m62788to() == 8) {
                return new C6440kk(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 3) {
                return new C6439k4(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
        }
        if (c13609qq.m62787kk() == 0) {
            if ((c13609qq2.m62787kk() == 1 || c13609qq2.m62787kk() == 2) && c13609qq2.m62788to() == 24) {
                return new C6473wl(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if ((c13609qq2.m62787kk() == 1 || c13609qq2.m62787kk() == 2) && c13609qq2.m62788to() == 32) {
                return new C6453qq(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62787kk() == 3) {
                return new C6466um(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
        }
        if (c13609qq.m62787kk() == 5) {
            if (c13609qq2.m62787kk() == 4) {
                return new C6447my(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
        }
        if (c13609qq.m62787kk() == 2) {
            int iM62788to3 = c13609qq.m62788to();
            if (iM62788to3 == 24) {
                int iM62787kk = c13609qq2.m62787kk();
                if (iM62787kk == 0) {
                    int iM62788to4 = c13609qq2.m62788to();
                    if (iM62788to4 == 8) {
                        return new C6474wp(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                    }
                    if (iM62788to4 == 16) {
                        return new C6459sv(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                    }
                    throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
                }
                if (iM62787kk == 1) {
                    int iM62788to5 = c13609qq2.m62788to();
                    if (iM62788to5 == 16) {
                        return new C6458ss(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                    }
                    if (iM62788to5 == 24) {
                        return new C6441kp(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                    }
                    if (iM62788to5 == 32) {
                        return new C6429gi(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                    }
                    throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
                }
                if (iM62787kk == 2) {
                    if (c13609qq2.m62788to() == 32) {
                        return new C6457s7(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                    }
                    throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
                }
                if (iM62787kk == 3) {
                    return new C6425f9(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                }
                if (iM62787kk == 4) {
                    return new C6427g8(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                }
                throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
            }
            if (iM62788to3 != 32) {
                throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
            }
            int iM62787kk2 = c13609qq2.m62787kk();
            if (iM62787kk2 == 0) {
                int iM62788to6 = c13609qq2.m62788to();
                if (iM62788to6 == 8) {
                    return new C6482y2(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                }
                if (iM62788to6 == 16) {
                    return new C6438jw(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                }
                throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
            }
            if (iM62787kk2 != 1) {
                if (iM62787kk2 == 2) {
                    if (c13609qq2.m62788to() == 24) {
                        return new C6450nv(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                    }
                    throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
                }
                if (iM62787kk2 == 3) {
                    return new C6428gf(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                }
                if (iM62787kk2 == 4) {
                    return new C6432he(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                }
                throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
            }
            int iM62788to7 = c13609qq2.m62788to();
            if (iM62788to7 == 8) {
                return new C6445m4(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6901du2, i6);
            }
            if (iM62788to7 == 16) {
                return new C6444m2(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (iM62788to7 == 24) {
                return new C6436j5(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (iM62788to7 == 32) {
                return new C6483y9(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
        }
        if (c13609qq.m62787kk() != 1) {
            throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
        }
        if (m26319k4(interfaceC6901du, interfaceC6901du2, i5, iM62788to, iM62788to2) && c13609qq2.m62787kk() == 1) {
            return new C6426fa(i, i2, i3, c12014ne.Clone(), i4, c13609qq);
        }
        if (i5 == 2 || iM62788to2 > 8) {
            i7 = i6;
        } else {
            i7 = i6;
            if (i7 >= ((int) C14116yg.m67469du(2.0d, iM62788to2))) {
                throw new ArgumentOutOfRangeException("fallbackIndex", C14113y2.m67407k4("Cannot use fallback index since the index value is out of range for the ", c13609qq2, " format."));
            }
        }
        if (iM62788to == 16) {
            return iM62788to2 <= 8 ? new C6423e0(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6901du2, i7) : iM62788to2 == 24 ? new C6415bz(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4) : new C6452qm(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
        }
        if (iM62788to == 24) {
            if (iM62788to2 <= 8 && c13609qq2.m62787kk() == 1) {
                return new C6471vj(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6901du2, i6);
            }
            if (iM62788to2 == 16 && c13609qq2.m62787kk() == 1) {
                return new C6470vh(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (iM62788to2 == 32 && c13609qq2.m62787kk() == 1) {
                return new C6462tq(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            int iM62787kk3 = c13609qq2.m62787kk();
            if (iM62787kk3 == 0) {
                return new C6481xw(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (iM62787kk3 != 2) {
                if (iM62787kk3 == 3) {
                    return new C6472w6(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                }
                if (iM62787kk3 == 4) {
                    return new C6460t6(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                }
                throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
            }
            if (c13609qq2.m62788to() == 24) {
                return new C6454qw(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62788to() == 32) {
                return new C6435j2(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
        }
        if (iM62788to == 32) {
            if (iM62788to2 <= 8 && c13609qq2.m62787kk() == 1) {
                return new C6489zj(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6901du2, i6);
            }
            if (iM62788to2 == 16 && c13609qq2.m62787kk() == 1) {
                return new C6409ai(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (iM62788to2 == 24 && c13609qq2.m62787kk() == 1) {
                return new C6455ri(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            int iM62787kk4 = c13609qq2.m62787kk();
            if (iM62787kk4 == 0) {
                return new C6424em(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (iM62787kk4 != 2) {
                if (iM62787kk4 == 3) {
                    return new C6418ca(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                }
                if (iM62787kk4 == 4) {
                    return new C6451os(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
                }
                throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
            }
            if (c13609qq2.m62788to() == 24) {
                return new C6436j5(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            if (c13609qq2.m62788to() == 32) {
                return new C6483y9(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
            }
            throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
        }
        if (iM62788to == iM62788to2) {
            return new C6480xk(i, i2, i3, interfaceC6901du, c13609qq, c12014ne.Clone(), i4, interfaceC6901du2, i5, interfaceC6904h4, i6);
        }
        if (iM62788to > iM62788to2) {
            return new C6463ts(i, i2, i3, interfaceC6901du, c13609qq, c12014ne.Clone(), i4, interfaceC6901du2, c13609qq2, i5, interfaceC6904h4, i6);
        }
        if (iM62788to <= 8 && iM62788to2 <= 8) {
            return new C6417c6(i, i2, i3, interfaceC6901du, c13609qq, c12014ne.Clone(), i4, interfaceC6901du2, c13609qq2, i5, interfaceC6904h4, i6);
        }
        int iM62787kk5 = c13609qq2.m62787kk();
        if (iM62788to2 == 16) {
            if (iM62787kk5 == 0) {
                return new C6469v4(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6901du);
            }
            if (iM62787kk5 == 1) {
                return new C6443lr(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6901du);
            }
            throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
        }
        if (iM62788to2 == 24) {
            if (iM62787kk5 == 1) {
                return new C6484yd(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6901du);
            }
            if (iM62787kk5 == 2) {
                return new C6412b3(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6901du);
            }
            throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
        }
        if (iM62787kk5 == 1) {
            return new C6475wy(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6901du);
        }
        if (iM62787kk5 == 2) {
            return new C6420dq(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6901du);
        }
        throw new NotImplementedException(C14113y2.m67402k4("Cannot perform conversion from{0} to {1} format.", c13609qq, c13609qq2));
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m26318k4(InterfaceC6901du interfaceC6901du, InterfaceC6901du interfaceC6901du2, int i, int i2) {
        boolean zM66729x1 = i == i2;
        if (!zM66729x1 || i > 8 || (zM66729x1 = C14067j2.m66729x1(interfaceC6901du, interfaceC6901du2))) {
            return zM66729x1;
        }
        int[] iArrMo27032x1 = interfaceC6901du.mo27032x1();
        int[] iArrMo27032x12 = interfaceC6901du2.mo27032x1();
        int iM67469du = (int) C14116yg.m67469du(2.0d, i);
        int iM67469du2 = (int) C14116yg.m67469du(2.0d, i2);
        int iM67507x1 = C14116yg.m67507x1(iArrMo27032x1.length, iM67469du);
        int iM67507x12 = C14116yg.m67507x1(iArrMo27032x12.length, iM67469du2);
        if (iM67507x12 < iM67507x1) {
            return false;
        }
        int iM67507x13 = C14116yg.m67507x1(iM67507x1, iM67507x12);
        for (int i3 = 0; i3 < iM67507x13; i3++) {
            if (interfaceC6901du2.mo27030k4(iArrMo27032x1[i3]) != i3) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m26319k4(InterfaceC6901du interfaceC6901du, InterfaceC6901du interfaceC6901du2, int i, int i2, int i3) {
        if (i != 1) {
            return i2 == i3 && i != 2;
        }
        if (i2 <= 8 && interfaceC6901du == null) {
            throw new ArgumentNullException("sourcePalette", "The source palette must exist for bits count <= 8.");
        }
        if (i3 > 8 || interfaceC6901du2 != null) {
            return m26318k4(interfaceC6901du, interfaceC6901du2, i2, i3);
        }
        throw new ArgumentNullException("destinationColorPalette", "The destination palette must exist for bits count <= 8.");
    }
}
