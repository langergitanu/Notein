package com.aspose.slides.internal.p213jw;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12772kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p517y2.InterfaceC12779to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5561x1 extends C5564yd<C5545k4> implements InterfaceC12779to {
    public C5561x1(C5543ix c5543ix) {
        super(c5543ix, (short) 5);
    }

    /* JADX INFO: renamed from: k4 */
    public final C5545k4 m22854k4(C5545k4 c5545k4) {
        m22853x1(c5545k4);
        return (C5545k4) C7019kk.m27452k4((Object) mo59445kk((InterfaceC12777qq) c5545k4), C5545k4.class);
    }

    /* JADX INFO: renamed from: kk */
    public final InterfaceC12772kk m22858kk(InterfaceC12772kk interfaceC12772kk) {
        m22853x1((C5545k4) C7019kk.m27452k4((Object) interfaceC12772kk, C5545k4.class));
        return (InterfaceC12772kk) mo59447to((InterfaceC12777qq) C7019kk.m27452k4((Object) interfaceC12772kk, C5545k4.class));
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC12772kk m22860x1(InterfaceC12772kk interfaceC12772kk) {
        for (int i = 0; i < mo59443k4(); i++) {
            if (mo59444k4(i) == interfaceC12772kk) {
                m59450x1(i);
                return interfaceC12772kk;
            }
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12779to
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12772kk mo22855k4(InterfaceC12772kk interfaceC12772kk) {
        return m22854k4((C5545k4) C7019kk.m27452k4((Object) interfaceC12772kk, C5545k4.class));
    }

    /* JADX INFO: renamed from: kk */
    public final InterfaceC12772kk m22859kk(String str) {
        return (InterfaceC12772kk) C7019kk.m27452k4((Object) mo59442du(str), C5545k4.class);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12779to
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC12772kk mo22861x1(String str) {
        return (InterfaceC12772kk) C7019kk.m27452k4((Object) mo59448to(str), C5545k4.class);
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12772kk m22856k4(String str, String str2) {
        return (InterfaceC12772kk) C7019kk.m27452k4((Object) mo59446kk(str, str2), C5545k4.class);
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC12772kk m22862x1(String str, String str2) {
        return (InterfaceC12772kk) C7019kk.m27452k4((Object) mo59449to(str, str2), C5545k4.class);
    }

    /* JADX INFO: renamed from: x1 */
    private void m22853x1(C5545k4 c5545k4) {
        if (C14113y2.m67363du(c5545k4.mo22626ck(), "xmlns")) {
            c5545k4.mo22660v4().m22805to().mo65707k4(c5545k4.mo22604c5(), c5545k4.mo22741kk());
        }
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12779to
    /* JADX INFO: renamed from: k4 */
    public final boolean mo22857k4(String str) {
        return mo59448to(str) != null;
    }
}
