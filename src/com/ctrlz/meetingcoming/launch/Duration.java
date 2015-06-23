package com.ctrlz.meetingcoming.launch;

public enum Duration {
	halfhour {
		@Override
		public int getMinute() {
			return 30;
		}

		@Override
		public String getName() {
			return "30����";
		}
	},
	threequarter {
		@Override
		public int getMinute() {
			return 45;
		}

		@Override
		public String getName() {
			return "45����";
		}
	},
	onehour {
		@Override
		public int getMinute() {
			return 60;
		}

		@Override
		public String getName() {
			return "1Сʱ";
		}
	},
	fivequarter {
		@Override
		public int getMinute() {
			return 75;
		}

		@Override
		public String getName() {
			return "75����";
		}
	},
	onehalf {
		@Override
		public int getMinute() {
			return 90;
		}

		@Override
		public String getName() {
			return "1����Сʱ";
		}
	},
	twohour {
		@Override
		public int getMinute() {
			return 120;
		}

		@Override
		public String getName() {
			return "2Сʱ";
		}
	},
	twohalf {
		@Override
		public int getMinute() {
			return 150;
		}

		@Override
		public String getName() {
			return "2����Сʱ";
		}
	},
	threehour {
		@Override
		public int getMinute() {
			return 180;
		}

		@Override
		public String getName() {
			return "3Сʱ";
		}
	},
	fourhour {
		@Override
		public int getMinute() {
			return 240;
		}

		@Override
		public String getName() {
			return "4Сʱ";
		}
	},
	fivehour {
		@Override
		public int getMinute() {
			return 300;
		}

		@Override
		public String getName() {
			return "5Сʱ";
		}
	};
	/*oneday {
		@Override
		public int getMinute() {
			return 480;
		}

		@Override
		public String getName() {
			return "1��";
		}
	};*/

	/**
	 * ���ʱ��(��λ:��)
	 * 
	 * @return minute
	 */
	public abstract int getMinute();

	/**
	 * �������
	 * 
	 * @return name
	 */
	public abstract String getName();
}
