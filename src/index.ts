import { registerPlugin } from '@capacitor/core';

import type { AndroidTiktokEventsPlugin } from './definitions';

const AndroidTiktokEvents = registerPlugin<AndroidTiktokEventsPlugin>('AndroidTiktokEvents', {});

export * from './definitions';
export { AndroidTiktokEvents };
