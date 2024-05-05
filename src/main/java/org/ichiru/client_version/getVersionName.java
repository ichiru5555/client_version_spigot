package org.ichiru.client_version;

public class getVersionName {
    public static String main(int protocolVersion) {
        switch (protocolVersion) {
            case 766: return "1.20.6";
            case 765: return "1.20.4";
            case 764: return "1.20.2";
            case 763: return "1.20.1";
            case 762: return "1.19.4";
            case 761: return "1.19.3";
            case 760: return "1.19.2";
            case 759: return "1.19";
            case 758: return "1.18.2";
            case 757: return "1.18.1";
            case 756: return "1.17.1";
            case 755: return "1.17";
            case 754: return "1.16.5";
            case 753: return "1.16.3";
            case 751: return "1.16.2";
            case 736: return "1.16.1";
            case 735: return "1.16";
            case 578: return "1.15.2";
            case 575: return "1.15.1";
            case 573: return "1.15";
            case 498: return "1.14.4";
            case 490: return "1.14.3";
            case 485: return "1.14.2";
            case 480: return "1.14.1";
            case 477: return "1.14";
            case 404: return "1.13.2";
            case 401: return "1.13.1";
            case 393: return "1.13";
            case 340: return "1.12.2";
            case 338: return "1.12.1";
            case 335: return "1.12";
            case 316: return "1.11.2";
            case 315: return "1.11";
            case 210: return "1.10.2";
            default: return "Unknown";
        }
    }
}
