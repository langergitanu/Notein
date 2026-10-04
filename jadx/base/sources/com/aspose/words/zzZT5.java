package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZT5 {
    public static zzZT7 zzZ(com.aspose.words.internal.zzZOX zzzox, IWarningCallback iWarningCallback) throws Exception {
        zzZTE zzzte = new zzZTE(zzzox);
        com.aspose.words.internal.zzZOP zzzopZzq = zzzox.zzq();
        if (zzzte.getLength() < 0 || zzzopZzq.getPosition() + ((long) zzzte.getLength()) > zzzopZzq.getLength()) {
            zzY1Z.zzZ(iWarningCallback, 10, "Invalid OfficeArt record length, corrected.", new Object[0]);
            zzzte.setLength((int) (zzzopZzq.getLength() - zzzopZzq.getPosition()));
        }
        zzZT7 zzzt7ZzZ = zzZ(zzzte, iWarningCallback);
        zzzt7ZzZ.zzZ(zzzte, zzzox, iWarningCallback);
        return zzzt7ZzZ;
    }

    private static zzZT7 zzZ(zzZTE zzzte, IWarningCallback iWarningCallback) {
        int type = zzzte.getType();
        switch (type) {
            case 61440:
                return new zzZTJ();
            case 61441:
                return new zzZTX();
            case 61442:
                return new zzZTL();
            case 61443:
                return new zzZSZ();
            case 61444:
                return new zzZT2();
            case 61445:
                return new zzZSU();
            case 61446:
                return new zzZTK();
            case 61447:
                return new zzZTW();
            case 61448:
                return new zzZTM();
            case 61449:
                return new zzZT0();
            case 61450:
                return new zzZT4();
            case 61451:
                break;
            default:
                switch (type) {
                    case 61453:
                        return new zzZTR();
                    case 61460:
                        return new zzZU2();
                    case 61463:
                        return new zzZTV();
                    case 61720:
                        return new zzZSQ();
                    case 61722:
                        zzY1Z.zzZ(iWarningCallback, 10, "ColorMru OfficeArt record is not supported, ignored.", new Object[0]);
                        return new zzZSQ();
                    case 61730:
                        break;
                    default:
                        switch (type) {
                            case 61455:
                                return new zzZTU();
                            case 61456:
                                return new zzZTT();
                            case 61457:
                                return new zzZTS();
                            case 61458:
                                return new zzZTP();
                            default:
                                switch (type) {
                                    case 61466:
                                    case 61467:
                                    case 61468:
                                        return new zzZTY();
                                    case 61469:
                                    case 61470:
                                    case 61471:
                                        break;
                                    default:
                                        switch (type) {
                                            case 61481:
                                            case 61482:
                                                break;
                                            default:
                                                switch (type) {
                                                    case 61725:
                                                        zzY1Z.zzZ(iWarningCallback, 10, "DeletedPspl OfficeArt record is not supported, ignored.", new Object[0]);
                                                        return new zzZSQ();
                                                    case 61726:
                                                        return new zzZST();
                                                    default:
                                                        zzY1Z.zzZ(iWarningCallback, 10, "Unknown OfficeArt record 0x{0:x4} found, ignored.", Integer.valueOf(zzzte.getType()));
                                                        return new zzZSQ();
                                                }
                                        }
                                        break;
                                }
                                return new zzZTZ();
                        }
                }
                break;
        }
        return new zzZSY();
    }
}
