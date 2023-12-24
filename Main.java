package practice;

public class Main {
	public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("실행 1");
        Electronic[] electronics = initializeElectronics();
        increaseVolume(electronics);
        displayElectronicInfo(electronics);
        
        System.out.println("=====================================");
        System.out.println("실행 2");
        Sound[] sounds = initializeSounds();
        increaseVolume(sounds);
        displaySoundInfo(sounds);
    }

    private static Electronic[] initializeElectronics() {
        Electronic[] electronics = {new TV(), new Radio()};
        return electronics;
    }

    private static Sound[] initializeSounds() {
        Sound[] sounds = {new Sedan(), new Bus(), new Truck(), new TV(), new Radio()};
        return sounds;
    }

    private static void increaseVolume(Sound[] sounds) {
        for (int i = 0; i < 2; i++) {
            for (Sound sound : sounds) {
                sound.soundUp();
            }
        }
    }
    
    private static void displayElectronicInfo(Electronic[] electronics) {
        for (Electronic electronic : electronics) {
            System.out.println(electronic.eleMember());
        }
    }

    private static void displaySoundInfo(Sound[] sounds) {
        for (Sound sound : sounds) {
            if (sound instanceof Car) {
                ((Car) sound).speedUp();
            }
            System.out.printf("[class %10s ]", sound.getClass().getSimpleName());
            if (sound instanceof Car) {
                ((Car) sound).carMember();
            } else if (sound instanceof TV) {
                System.out.println(((TV) sound).eleMember());
            } else if (sound instanceof Radio) {
                System.out.println(((Radio) sound).eleMember());
            }
        }
    }
}