import { WebPlugin } from '@capacitor/core';

import type { AndroidTiktokEventsPlugin } from './definitions';

export class AndroidTiktokEventsWeb extends WebPlugin implements AndroidTiktokEventsPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
