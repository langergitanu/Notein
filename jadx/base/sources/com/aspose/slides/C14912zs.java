package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.zs */
/* JADX INFO: loaded from: classes3.dex */
class C14912zs {
    /* JADX INFO: renamed from: k4 */
    public static Shape m74781k4(ShapeCollection shapeCollection, com.aspose.slides.internal.p332p7.p9u p9uVar, wxb wxbVar) {
        byte b;
        byte b2;
        int iM38717k4 = p9uVar.m38717k4();
        int i = 98;
        if (iM38717k4 != 1 && iM38717k4 != 2) {
            if (iM38717k4 == 3) {
                i = 96;
            } else if (iM38717k4 == 4) {
                i = 102;
            }
        }
        int i2 = i;
        float fM72703h4 = (float) wgi.m72703h4(p9uVar.m38725x1());
        float fM72703h42 = (float) wgi.m72703h4(p9uVar.m38720kk());
        float fM72703h43 = ((float) wgi.m72703h4(p9uVar.m38715h4())) - fM72703h4;
        float fM72703h44 = ((float) wgi.m72703h4(p9uVar.m38722m9())) - fM72703h42;
        if (fM72703h43 < 0.0f) {
            fM72703h4 += fM72703h43;
            b = 1;
        } else {
            b = 0;
        }
        if (fM72703h44 < 0.0f) {
            fM72703h42 += fM72703h44;
            b2 = 1;
        } else {
            b2 = 0;
        }
        Connector connector = (Connector) shapeCollection.addConnector(i2, fM72703h4, fM72703h42, C14116yg.m67480k4(fM72703h43), C14116yg.m67480k4(fM72703h44));
        if (b == 1 || b2 == 1) {
            IShapeFrame frame = connector.getFrame();
            connector.setFrame(new ShapeFrame(frame.getX(), frame.getY(), frame.getWidth(), frame.getHeight(), b, b2, frame.getRotation()));
        }
        wr8.m72895k4(connector, p9uVar.m38714fa(), wxbVar);
        if (!C14113y2.m67411k4(p9uVar.m38723to()) && wxbVar.m72959m9().containsKey(p9uVar.m38723to())) {
            Shape shape = wxbVar.m72959m9().get_Item(p9uVar.m38723to());
            if (shape.getConnectionSiteCount() > 0) {
                connector.setStartShapeConnectedTo(shape);
                long jM38711du = p9uVar.m38711du() & 4294967295L;
                if (jM38711du > 0 && jM38711du < shape.getConnectionSiteCount()) {
                    connector.setStartShapeConnectionSiteIndex(((((long) shape.getConnectionSiteCount()) & 4294967295L) - jM38711du) & 4294967295L);
                }
            }
        }
        if (!C14113y2.m67411k4(p9uVar.m38713dy()) && wxbVar.m72959m9().containsKey(p9uVar.m38713dy())) {
            Shape shape2 = wxbVar.m72959m9().get_Item(p9uVar.m38713dy());
            if (shape2.getConnectionSiteCount() > 0) {
                connector.setEndShapeConnectedTo(shape2);
                long jM38709c5 = p9uVar.m38709c5() & 4294967295L;
                if (jM38709c5 > 0 && jM38709c5 < shape2.getConnectionSiteCount()) {
                    connector.setEndShapeConnectionSiteIndex(((((long) shape2.getConnectionSiteCount()) & 4294967295L) - jM38709c5) & 4294967295L);
                }
            }
        }
        return connector;
    }
}
