package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes7.dex */
final class zbwj {
    public static String zba(zbtc zbtcVar) {
        StringBuilder sb = new StringBuilder(zbtcVar.zbd());
        for (int i = 0; i < zbtcVar.zbd(); i++) {
            byte bZba = zbtcVar.zba(i);
            if (bZba == 34) {
                sb.append("\\\"");
            } else if (bZba == 39) {
                sb.append("\\'");
            } else if (bZba != 92) {
                switch (bZba) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bZba < 32 || bZba > 126) {
                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb.append((char) (((bZba >>> 6) & 3) + 48));
                            sb.append((char) (((bZba >>> 3) & 7) + 48));
                            sb.append((char) ((bZba & 7) + 48));
                        } else {
                            sb.append((char) bZba);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
