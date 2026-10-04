package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMY extends zzZLZ {
    private List<zzZN5> zzZUA = new ArrayList();

    public static zzZMY zzT(zzZQR zzzqr) {
        zzZMY zzzmy = new zzZMY();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("source".equals(strZzRu)) {
                    zzzmy.setId(attributeValue);
                } else {
                    zzzmy.zzZL(strZzRu, attributeValue);
                }
            } catch (Exception e) {
                zzZHV.zzY(e);
            }
        }
        zzZN5 zzzn5 = null;
        zzZN5 zzzn52 = null;
        while (zzzqr.hasNext()) {
            int eventType = zzzqr.getEventType();
            if (eventType != 1) {
                if (eventType == 2) {
                    if (zzzn52 != null) {
                        zzzmy.zzZUA.add(zzzn52);
                    }
                    if (zzzqr.getLocalName().equals(zzzn5.getName())) {
                        return zzzmy;
                    }
                    zzzn52 = null;
                } else if (eventType == 4 && zzzn52 != null) {
                    zzzn52.setValue(zzzqr.getText());
                }
            } else if (zzzn5 == null) {
                zzzn5 = new zzZN5();
                zzzn5.setName(zzZN8.decode(zzzqr.getLocalName()));
            } else {
                zzzn52 = new zzZN5();
                zzzn52.setName(zzZN8.decode(zzzqr.getLocalName()));
                for (int i2 = 0; i2 < zzzqr.getAttributeCount(); i2++) {
                    zzzn52.getAttributes().put(zzZN8.decode(zzzqr.zzRv(i2).getLocalPart()), zzzqr.getAttributeValue(i2));
                }
            }
            zzzqr.next();
        }
        return null;
    }

    public final List<zzZN5> zzgR() {
        return this.zzZUA;
    }
}
